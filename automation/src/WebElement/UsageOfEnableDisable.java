package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfEnableDisable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean res=driver.findElement(By.name("login")).isEnabled();
		if(res) {
			System.out.println("thae login button is enable");
		}else {
			System.out.println("the login butoon is disable");
		}
		driver.quit();

	}

}
