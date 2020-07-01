package pages;

import org.openqa.selenium.By;
import hooks.TestNgHooks;
import io.cucumber.java.en.When;

public class OffnetAccountCreationPage extends TestNgHooks{

	/*
	 * @When("Click Leads Tab in My Home Page") public MyLeadsPage clickLeadsTab() {
	 * click(getDriver().findElement(By.linkText("Leads"))); return new
	 * MyLeadsPage(); }
	 */
	@When("Type First Name(.*)$")
	public OffnetAccountCreationPage EnterFirstName(String FirstName) {
		type(getDriver().findElement(By.xpath("//input[@placeholder='First Name']")), FirstName);
		return this;
	}
	@When("Type Last Name(.*)$")
	public OffnetAccountCreationPage EnterLastName(String LastName) {
		type(getDriver().findElement(By.xpath("//input[@placeholder='Last Name']")), LastName);
		return this;
	}
	@When("Type Email ID(.*)$")
	public OffnetAccountCreationPage EnterEmailID(String EmailID) {
		type(getDriver().findElement(By.xpath("//input[@placeholder='Email']")), EmailID);
		return this;
	}
	@When("Type ZipCode(.*)$")
	public OffnetAccountCreationPage EnterZipCode(String ZipCode) {
		type(getDriver().findElement(By.id("registerZipCode")), ZipCode);
		return this;
	}
    @When("Click AccountCreation ContiuneButton")
	public OffnetCimaPage OffnetAccCreContiuneButton() {
		click(getDriver().findElement(By.xpath("(//button[@class='button'])[2]")));
		return new OffnetCimaPage();
	}

}
