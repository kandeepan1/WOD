package pages;

import org.openqa.selenium.By;
import hooks.TestNgHooks;
import io.cucumber.java.en.When;

public class OffnetLoginPage extends TestNgHooks{
	@When("Type Username in login page(.*)$")
	public OffnetLoginPage EnterUserName(String username) {
		type(getDriver().findElement(By.id("user")), username);
		return this;
	}
	
	@When("Type Password in login page(.*)$")
	public OffnetLoginPage EnterPassword(String lpassword) {
		type(getDriver().findElement(By.id("passwd")), lpassword);
		return this;
	}
    @When("Click Sign In Button in login page")
	public OffnetStorePage ClickSign() {
		click(getDriver().findElement(By.id("sign_in")));
		return new OffnetStorePage();
	}

}
