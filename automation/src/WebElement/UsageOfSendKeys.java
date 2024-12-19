package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("rama200@"+Keys.CONTROL+"AC");
		driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");//Thread.sleep(200);
		driver.findElement(By.name("login")).click();
		

	}

}
