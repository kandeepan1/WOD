package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;
import io.cucumber.java.en.When;

public class OffnetConfirmOrderPage extends TestNgHooks{
		
	@When("Click Confirm button on Confirm Order page")
	public OffnetOrderCompletionPage ClickConfrimButton() {
		click(getDriver().findElement(By.id("payButton")));
		return new OffnetOrderCompletionPage();
	}
}
