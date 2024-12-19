package Practise;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http:www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		List<WebElement> allsugs=driver.findElements(By.xpath("//span[contains(text(),\"java\")]"));
		for (WebElement ele : allsugs) {
			String text=ele.getText();
			System.out.println(text);
			
			
		}
		

	}

}
