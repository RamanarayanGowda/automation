package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.findElement(By.id("gbwa")).click();
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		

	}

}
