package WebDeriver;

import java.awt.Point;

import javax.swing.text.Position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qspiders.com/");
		driver.navigate().to("https://jspiders.com/");
		driver.navigate().back();
		driver.navigate().refresh();
	String	title=driver.getTitle();//Thread.sleep(200);
	driver.getCurrentUrl();
	driver.manage().window().setSize(new Dimension(300,183));
	driver.manage().window().setPosition(new org.openqa.selenium.Point(200,777));
String	pgsrc=driver.getPageSource();
driver.close();
	
		

	}

}
