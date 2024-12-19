package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipledatabyrow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stu
		FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int lastrw = wb.getSheet("MultipleData").getLastRowNum();
		System.out.println(lastrw);
		
		

	}

}
