package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("manga");
		List<WebElement> auto = driver.findElements(By.xpath("//span[contains(text(),'manga')]"));
		int count = auto.size();
		System.out.println(count);
		for (WebElement ele : auto) {
			System.out.println(ele.getText());
			
		}
		
//		driver.quit();
		
		
		
		

	}

}
