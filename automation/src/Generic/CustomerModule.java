package Generic;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule extends BaseClass{
	@BeforeClass
	public void openBrowser() {
		Reporter.log("openBrowser",true);
		
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	@AfterClass
	
	
	
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);}
	
	@Test
	public void CreateCustimer() {
		Reporter.log("CreateCustomer",true);
	}
	@Test(priority=1)
	public void modifyCustomer() {
		Reporter.log("modify",true);
	}
	@Test(priority=2)
	public void DeleteCustomer() {
		Reporter.log("DeleteCustomer",true);
	}


}
