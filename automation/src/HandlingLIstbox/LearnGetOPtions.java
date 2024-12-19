package HandlingLIstbox;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnGetOPtions {

	private static final List<WebElement> WebElement = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/LENOVO/Documents/Democity.html");
		WebElement lang=driver.findElement(By.id("city"));
		Select s=new Select(lang);
		WebElement ele=s.getFirstSelectedOption();
		System.out.println(ele.getText());
		List<WebElement> allselele=s.getAllSelectedOptions();
		for(int i=0;i<allselele.size();i++) {
			WebElement element=allselele.get(i);
			String text=element.getText();
			System.out.println(text);
		}
		List<WebElement> allele=s.getOptions();
		for (WebElement ele1 : allele) {
			System.out.println(ele1.getText());
			
		}

	}

}
