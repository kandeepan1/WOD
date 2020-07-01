package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;
import io.cucumber.java.en.When;

public class OffnetNewPayConfirmOrderpage extends TestNgHooks{

	@When("Click Confirm button")
	public OffnetOrderCompletionPage NewPayClickConfirmButton() {
		click(getDriver().findElement(By.id("payButton")));
		return new OffnetOrderCompletionPage();
	}

	public void ClickCheckbox() {
		click(getDriver().findElement(By.xpath("//label[@for='cardToFileLabel']")));

	}

}
