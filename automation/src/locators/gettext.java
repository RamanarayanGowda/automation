package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement button = driver.findElement(By.name("login"));
		String tagname=button.getTagName();
		String tagtext=button.getText();
		String value=button.getAttribute("data-testid");
		String colour=button.getCssValue("background-colour");
		System.out.println("tagname");
		System.out.println("tagtext");
		System.out.println("value");
		System.out.println("colour");
		driver.quit();

		
	}

}
