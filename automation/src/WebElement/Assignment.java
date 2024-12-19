package WebElement;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement button=driver.findElement(By.name("login"));
		String tagname=button.getText();
		String color=button.getCssValue("background");
		System.out.println("tagname of the element:"+tagname);
		System.out.println("color of the element:"+color);
		

	}

}
