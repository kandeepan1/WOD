package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;
import io.cucumber.java.en.When;

public class OffnetOrderCompletionPage extends TestNgHooks{
	@When("Click Purchase Another Pass button on Order Completion page")
	public OffnetStorePage ClickPurchaseAnotherPass() {
		click(getDriver().findElement(By.className("button")));
		return new OffnetStorePage();
	}
}
