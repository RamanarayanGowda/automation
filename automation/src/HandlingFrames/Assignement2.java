package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stuweb
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Web Elements']")).click();
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		driver.findElement(By.linkText("Nested with Multiple iframe")).click();
		driver.switchTo().frame(0);
		String email=driver.findElement(By.xpath("//p[@class='para'][1]")).getText();
		String pwd=driver.findElement(By.xpath("//p[@class='para'][2]")).getText();
		String cnfpwd=driver.findElement(By.xpath("//p[@class='para'][3]")).getText();
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		driver.findElement(By.id("confirm")).sendKeys(cnfpwd);
		
////		driver.switchTo().frame(3);
//		
		
	
		
		


		
		

	}

}
