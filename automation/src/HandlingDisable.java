import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Documents/Disable.html");
		driver.findElement(By.id("t1")).sendKeys("virat");Thread.sleep(900);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('t2').value='anushk'");

	}

}
