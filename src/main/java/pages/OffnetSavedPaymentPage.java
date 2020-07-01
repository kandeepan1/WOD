package pages;

import org.openqa.selenium.By;
import hooks.TestNgHooks;
import io.cucumber.java.en.When;

public class OffnetSavedPaymentPage extends TestNgHooks{

	@When("Click Saved wallet on payment page")
	public OffnetSavedPaymentPage SelectWallet() {
		click(getDriver().findElement(By.xpath("//label[text()='Visa']")));
		return this;
	}
	
	@When("Click Contiune button in payment page")
	public OffnetConfirmOrderPage ClickContiuneButton() {
		click(getDriver().findElement(By.xpath("//button[@data-action='continue']")));
		return new OffnetConfirmOrderPage();
	}

}
