package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import javax.security.auth.login.AccountException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stubfile
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty("url");
		driver.get(data);
		FileInputStream fis1=new FileInputStream("./data/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		int count = wb.getSheet("invalidloginadmin").getLastRowNum();
//		System.out.println(count);
		for(int i=0;i<=count;i++) {
			String un = wb.getSheet("invalidloginadmin").getRow(i).getCell(0).getStringCellValue();
			String pwd = wb.getSheet("invalidloginadmin").getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
		try {
				
		driver.findElement(By.id("logoutLink")).click();
		wb.getSheet("invalidlogiadmin").getRow(i).getCell(2).setCellValue("pass");
			}
			catch(NoSuchElementException e){
				wb.getSheet("invalidloginadmin").getRow(i).getCell(2).setCellValue("fail");
			}
		}
		FileOutputStream fos=new FileOutputStream("./data/testScript.xlsx");
		wb.write(fos);
		driver.quit();
				
		
		

	}

}
