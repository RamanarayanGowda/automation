package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleOfDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stubw
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Documents/Democity1.html");
		 WebElement cc = driver.findElement(By.id("city"));

		Select s= new Select(cc);
		boolean res = s.isMultiple();
		if(res==true) {
			System.out.println("the dropdown is multi-select");
		}
			else {
				System.out.println("the dropdown is single select");
				
			
		}
		
	}

}
