package Generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UserModule extends BaseClass{
	@Test
	public void CreateProject() {
		Reporter.log("CreateProject",true);
	}@Test
	public void ModifyProject() {
		Reporter.log("ModifyProject",true);
	}@Test
	public void DeleteProject() {
		Reporter.log("DeleteProject",true);
	}

}
