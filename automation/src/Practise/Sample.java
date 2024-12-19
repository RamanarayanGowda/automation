package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https:www.google.com");
//		driver.findElement(By.xpath("//button[@jsname='ZUkOIc']")).click();
		driver.findElement(By.name("q")).sendKeys("kholi");Thread.sleep(500);
		List<WebElement> alllinks=driver.findElements(By.xpath("//div[@id='Alh6id']"));
		for (WebElement ele : alllinks) {
			System.out.println(ele.getText());
			driver.quit();
			
		}
		driver.findElement(By.xpath("//a[@class=\"gb_A\"]")).click();
		driver.findElement(By.xpath("//body[@jsmodel=\"hspDDf \"]")).click();

	}
}


