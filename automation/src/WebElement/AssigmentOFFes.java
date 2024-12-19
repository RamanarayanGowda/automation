package WebElement;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigmentOFFes {

	public static void main(String[] args) {
		// TODO Auto-generated method stuw
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("login")).click();
		String color=Button("background-color");
		System.out.println(color);
		

	}

	private static String Button(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
