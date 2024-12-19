package HandlingLIstbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Documents/Democity.html");
		WebElement city=driver.findElement(By.id("city"));
		Select s= new Select(city);
		s.selectByIndex(0);Thread.sleep(300);
		s.selectByValue("m");Thread.sleep(300);
		s.selectByVisibleText("Mysuru");Thread.sleep(300);
		s.deselectAll();

	}

}
