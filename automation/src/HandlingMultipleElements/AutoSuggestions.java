package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String s1= "java";
		driver.findElement(By.id("APjFqb")).sendKeys(s1);
		Thread.sleep(3000);
		String xp="//span[contains(text(),'+ s1 +'))]";
		List<WebElement> allSuggestions = driver.findElements(By.xpath(xp));
		 System.out.println(allSuggestions.size());
		for( WebElement ele: allSuggestions)
		{
				String s =ele.getText();
				System.out.println(s);
		}
		

	}

}
