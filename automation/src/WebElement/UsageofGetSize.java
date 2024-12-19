package WebElement;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement firstname=driver.findElement(By.name("firstname"));
		WebElement lastname=driver.findElement(By.name("lastname"));
		Dimension d1=firstname.getSize();
		Dimension d2=lastname.getSize();
		d1.getHeight();
		d1.getWidth();
		d2.getHeight();
		d2.getWidth();
//		System.out.println("firstname height is:"+d1);
//		System.out.println("lastname height is:"+d2);
//		System.out.println("firstname width is:"+d1);
//		System.out.println("lastname width is:"+d2);
		Point p1=firstname.getLocation();
		Point p2=lastname.getLocation();
		int xaxis1=p1.getX();
//		int xaxis=p1.getY();
		
		
		  System.out.println("xaxsis is:"+p1);       

	}

}
