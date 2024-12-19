package Assertations;

import static org.testng.Assert.assertEquals;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitle {
	@Test
	public void VerifyTitle() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		@Nullable
		String act = driver.getTitle();
		String exp="googy";
		SoftAssert s=new SoftAssert();
		s.assertEquals(act, exp);
		System.out.println(act);
		driver.quit();
		s.assertAll();
		
		
	}
	
	

}
