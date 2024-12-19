package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTextTagnameAttributeCssValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement button=driver.findElement(By.name("login"));
		String Tagname=button.getTagName();
//		System.out.println(Tagname);
		String Tagtext=button.getText();
		String value=button.getAttribute("data-testid");
		String color=button.getCssValue("background-color");
		System.out.println("the tagname of the element:"+Tagname);
	    System.out.println("the Attribute value of the element:"+value);
		System.out.println("the Css value of the element:"+color);
		
		
	
		

	}

}
