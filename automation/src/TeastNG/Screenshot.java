package TeastNG;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	@Test
	public void demo() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.instagram.com");
	 TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File des=new File("./Screenshot/logo.png");
	FileUtils.copyFile(src, des);
	driver.quit();
		 
	}

}
