package pages;

import org.openqa.selenium.By;
import hooks.TestNgHooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OffnetNewPaymentPage extends TestNgHooks{

	@When("Type First Name in paymentpage")
	public OffnetNewPaymentPage TypePFirstname(String PFirstname) {
		type(getDriver().findElement(By.xpath("//input[@placeholder='First Name']")),PFirstname);
		return this;
	}

	@When("Type Last Name in paymentpage")
	public OffnetNewPaymentPage TypePLastname(String PLastName) {
		type(getDriver().findElement(By.xpath("//input[@placeholder='Last Name']")),PLastName );
		return this;
	}

	@When("Type Billing Address")
	public OffnetNewPaymentPage TypeBillingAdd(String Billadd) {
		type(getDriver().findElement(By.xpath("//input[@placeholder='Billing Address 1']")), Billadd);
		return this;
	}
	@When("Type City Name")
	public OffnetNewPaymentPage TypeCityName(String City) {
		type(getDriver().findElement(By.xpath("//input[@placeholder='City']")),City);
		return this;
	}

	@When("Select State")
	public OffnetNewPaymentPage SelectState() {
		
		selectDropDownUsingValue(getDriver().findElement(By.xpath("//label[@class='select']//select[1]")), "IL");
		/*
		 * click(getDriver().findElement(By.xpath("//label[@class='select']//select[1]")
		 * ));
		 */
		return this;
	}

	@When("Zipcode paymentpage")
	public OffnetNewPaymentPage TypeZipCode(String pZipCode) {
		type(getDriver().findElement(By.xpath("//input[@placeholder='Zip Code']")), pZipCode);
		return this;
	}
	
	@Then("Switch to iframe")
	public OffnetNewPaymentPage SwitchToiFrame() {
		switchToFrame(getDriver().findElement(By.id("payment_frame")));
		return this;
	}

	@When("Type CardNumber")
	public OffnetNewPaymentPage TypeCardNum(String CardNum) {
		type(getDriver().findElement(By.xpath("//input[@payments-format='card']")), CardNum);
		return this;
	}

	@When("Type Expiration")
	public OffnetNewPaymentPage TypeExp(String Exp) {
		type(getDriver().findElement(By.xpath("//input[@placeholder='MM/YY']")), Exp);
		return this;
	}

	@When("Type Expiration")
	public OffnetNewPaymentPage TypeCvv(String Cvv) {
		type(getDriver().findElement(By.xpath("//input[@placeholder='CVV']")), Cvv);
		return this;
	}
	
	@Then("Switch out of iframe")
	public OffnetNewPaymentPage SwitchOutFrame() {
		switchOutofFrame();
		return this;
	}
	
	@When("Click Contiunebutton")
	public OffnetNewPayConfirmOrderpage ClickButton() {
		click(getDriver().findElement(By.xpath("(//button[@class='button'])[2]")));
		return new OffnetNewPayConfirmOrderpage();

	}

}


