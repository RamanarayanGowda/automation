package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogiToActiTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stuw
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.actitime.com/");
//		driver.findElement(By.id("Enteryouremail")).sendKeys("admin");

	}

}
