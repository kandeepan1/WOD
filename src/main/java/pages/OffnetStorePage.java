package pages;

import org.openqa.selenium.By;
import hooks.TestNgHooks;
import io.cucumber.java.en.When;

public class OffnetStorePage extends TestNgHooks{

	/*
	 * @When("The logout is clicked") public LoginPage clickLogOut() {
	 * click(getDriver().findElement(By.className("decorativeSubmit"))); return new
	 * LoginPage(); }
	 * 
	 * @When("CRM is clicked") public MyHomePage clickCRMSFA() {
	 * click(getDriver().findElement(By.linkText("CRM/SFA"))); return new
	 * MyHomePage(); }
	 */
	@When("Store page click one hour pass")
	public OffnetStorePage ClickOneHourPass() {
		click(getDriver().findElement(By.xpath("(//span[@class='offer-list-offer-name'])[1]")));
		return this;
	}

	public OffnetStorePage ClickTwoHourPass() {
		click(getDriver().findElement(By.xpath("(//span[@class='offer-list-offer-name'])[2]")));
		return this;
	}

	public OffnetStorePage ClickDayPass() {
		click(getDriver().findElement(By.xpath("(//span[@class='offer-list-offer-name'])[3]")));
		return this;
	}

	public OffnetStorePage ClickWeekPass() {
		click(getDriver().findElement(By.xpath("(//span[@class='offer-list-offer-name'])[4]")));
		return this;
	}

	public OffnetStorePage ClickMonthPass() {
		click(getDriver().findElement(By.xpath("(//span[@class='offer-list-offer-name'])[5]")));
		return this;
	}

	@When("Click Contiune Button")
	public OffnetAccountCreationPage StoreContiuneButton() {
		click(getDriver().findElement(By.xpath("//button[@data-action='continue']")));
		return new OffnetAccountCreationPage();
	}
	
	@When("Click Contiune button in Store page")
	public OffnetSavedPaymentPage ClickStoreContiuneButton() {
		click(getDriver().findElement(By.xpath("//button[@data-action='continue']")));
		return new OffnetSavedPaymentPage();

	}
	@When("Click on Signin Link in Store page")
	public OffnetLoginPage StoreSigninLink() {
		click(getDriver().findElement(By.linkText("Sign In")));
		return new OffnetLoginPage();
	}

}
