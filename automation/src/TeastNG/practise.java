package TeastNG;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class practise {
	@Test(priority=0,invocationCount=2)
	public void createCustomer() {
//		Assert.fail();
		Reporter.log("create customer",true);
	
	}@Test(priority=1,dependsOnMethods="createCustomer")
	public void modifycustomer()
	{
		Reporter.log("modify customer", true);}}
//	}@Test(priority=2,dependsOnMethods={"craeteCustomer","modifyCustomer"})
//	public void deletecustomer()
//{
//		Reporter.log("delete customer",true);}
//}
