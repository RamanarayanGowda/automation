package GenericLibrary;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stubfile f= newfile
		FileLib f= new FileLib();
		String url = f.getPropertyData("url");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		String un = f.getPropertyData("un");
		String pwd = f.getPropertyData("pwd");
//		driver.findElement(By.id("usename")).sendKeys(un);
//		driver.findElement(By.name("pwd")).sendKeys(pwd);
//		String data1 = f.getExcelData("createcustomer",1,4);
//		System.out.println(data1);
//		String data2 = f.getExcelData("multipleData",11,0);
//		System.out.println(data2);
//		String data3 = f.getExcelData("invalidloginadmin", 0, 2);
//		System.out.println(data3);
//		f.setExcelData("createcustomer", 1, 5, "gokul");
//		f.setExcelData("multipledata", 5, 2, "gabah");
//		f.setExcelData("invalidloginadmin", 0 ,2, "pass");
//				
//		
				
		

	}

}
