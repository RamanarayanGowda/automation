package WebDeriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSouceCode {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.get("http:www.facebook.com");
	String	pgrc=driver.getPageSource();//Thread.sleep(2);
	driver.close();

	}

}
