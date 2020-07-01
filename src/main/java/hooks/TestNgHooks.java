package hooks;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import services.WebDriverServiceImpl;
import utils.DataInputProvider;

public class TestNgHooks extends WebDriverServiceImpl{

	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}

	@BeforeClass
	public void beforeClass() {
		startTestCase(testCaseName, testDescription);		
	}

	@BeforeMethod
	public void beforeMethod() throws FileNotFoundException, IOException, Exception {

		startTestcase(nodes);		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeOptions options = new ChromeOptions();

		if(properties.getProperty("Headless").equalsIgnoreCase("true"))
			options.setHeadless(true);

		webdriver = new ChromeDriver(options);
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);

		tlDriver.set(driver);		
		getDriver().manage().window().maximize();
		getDriver().get(properties.getProperty("URL"));
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// properties.load(new FileInputStream(new File("./environment.properties")));

		/*
		 * Robot robot = new Robot(); for(int i = 0; i<2; i++) {
		 * robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_SUBTRACT);
		 * robot.keyRelease(KeyEvent.VK_SUBTRACT);
		 * robot.keyRelease(KeyEvent.VK_CONTROL);
		 */


	}
	/*
	 * @BeforeMethod() public void startLogin() {
	 * type(getDriver().findElement(By.id("username")),
	 * properties.getProperty("UserName"));
	 * type(getDriver().findElement(By.id("password")),
	 * properties.getProperty("Password"));
	 * click(getDriver().findElement(By.className("decorativeSubmit"))); }
	 */

	@AfterMethod
	public void afterMethod() {
		closeActiveBrowser();
	}

	@AfterSuite
	public void afterSuite() {
		endResult();
	}

	@DataProvider(name="fetchData" /*parallel=true*/)
	public  Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName);		
	}	



}
