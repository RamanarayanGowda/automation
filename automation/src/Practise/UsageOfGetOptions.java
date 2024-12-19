package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfGetOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Documents/Democity1.html");
		WebElement cit = driver.findElement(By.id("city"));
		Select s=new Select(cit);
		 List<WebElement> ele = s.getOptions();
		 for (WebElement wb : ele) {
			 String text = wb.getText();
			
		
		System.out.println(wb.getText());
		 }
		

	}

}
