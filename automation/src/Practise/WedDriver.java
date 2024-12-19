package Practise;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class WedDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.qspiders.com/");
		driver.navigate().back();
		driver.get("https://jspiders.com/");
//		driver.navigate().forward();
//		driver.navigate().back();
//		driver.navigate().refresh();
	String ele = driver.getTitle();
		System.out.println(ele);
		String cr = driver.getCurrentUrl();
		
		System.out.println(cr);
//		driver.manage().window().maximize();
//	driver.manage().window().setSize(new Dimension(300,183));
//	driver.manage().window().setPosition(new Point(200,777));
		String pgsr = driver.getPageSource();
		System.out.println(pgsr);
//		driver.manage().window().minimize();
	driver.close();
//		
		

	}

}
