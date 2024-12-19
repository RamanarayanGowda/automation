package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeAutomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stuwebdr
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'USERS')]")).click();
		driver.findElement(By.linkText("TASKS")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Add New')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'+ New Customer')]")).click();
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("rama");
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("AutomationTesting");

	}

}
