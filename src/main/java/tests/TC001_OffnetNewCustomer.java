package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.OffnetStorePage;

public class TC001_OffnetNewCustomer extends TestNgHooks {

	@BeforeTest
	public void setData() {
		testCaseName = "TC001-Offnet";
		testDescription = "Offnet - New CustomerFlow - One Hour Pass";
		category = "smoke";
		authors = "Kandeepan";
		dataSheetName = "TC001";
		nodes = "OffnetFlow";
	}

	@Test( dataProvider="fetchData" ) 
	public void CreateNewCustomerOffnet(String FirstName, String LastName, String EmailID, String ZipCode,
			String cpassword,String cfpassword, String PFirstname, String PLastName, 
			String Billadd, String City,String pZipCode,String CardNum, String Exp, String Cvv) 
	
	{
		new OffnetStorePage()
		.ClickOneHourPass()
		.StoreContiuneButton()
		.EnterFirstName(FirstName)
		.EnterLastName(LastName)
		.EnterEmailID(EmailID)
		.EnterZipCode(ZipCode)
		.OffnetAccCreContiuneButton()
		.UsernameLink()
		.CreatePassword(cpassword)
		.ConfirmPassword(cfpassword)
		.CimapageContiuneButton()
		.TypePFirstname(PFirstname)
		.TypePLastname(PLastName)
		.TypeBillingAdd(Billadd)
		.TypeCityName(City)
		.SelectState()
		.TypeZipCode(pZipCode)
		.SwitchToiFrame()
		.TypeCardNum(CardNum)
		.TypeExp(Exp)
		.TypeCvv(Cvv)
		.SwitchOutFrame()
		.ClickButton()
        .NewPayClickConfirmButton()
        .ClickPurchaseAnotherPass();   
	}
		
}
		

