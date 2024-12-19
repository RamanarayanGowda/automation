package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		 WebElement link = driver.findElement(By.linkText("Forgotten password"));
		link.click();

	}

}
