package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.OffnetStorePage;

public class TC002_OffnetExistingCustomer extends TestNgHooks {

	@BeforeTest
	public void setData() {
		testCaseName = "TC002-Offnet";
		testDescription = "Offnet - Existing CustomerFlow - One Hour Pass";
		category = "smoke";
		authors = "Kandeepan";
		dataSheetName = "TC002";
		nodes = "OffnetFlow";
	}

	@Test( dataProvider="fetchData" ) 
	public void ExistingCustomerOffnet(String username, String lpassword) 
	{
		new OffnetStorePage()
		.StoreSigninLink()
		.EnterUserName(username)
		.EnterPassword(lpassword)
		.ClickSign()
		.ClickOneHourPass()
		.ClickStoreContiuneButton()
		.SelectWallet()
		.ClickContiuneButton()
		.ClickConfrimButton()
		.ClickPurchaseAnotherPass();
		
	}
		
}
		

