package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;
import io.cucumber.java.en.When;

public class OffnetCimaPage extends TestNgHooks{
	@When("Click Email as UserName")
	public OffnetCimaPage UsernameLink() {
		click(getDriver().findElement(By.id("usePersonalEmail")));
		return this;
	}

	@When("Type Password(.*)$") 
	public OffnetCimaPage CreatePassword(String cpassword) { 
		type(getDriver().findElement(By.id("password")), cpassword);
			return this; }

	@When("Type Confirm Password(.*)$") 
	public OffnetCimaPage ConfirmPassword(String cfpassword) {
		type(getDriver().findElement(By.id("passwordRetype")),cfpassword); 
		return this;
	}

	@When("Click Contiune Button in CIMA Page")
	public OffnetNewPaymentPage CimapageContiuneButton() {
		click(getDriver().findElement(By.id("submitButton")));
		return new OffnetNewPaymentPage();
	}

}
