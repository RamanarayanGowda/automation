package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTheDataVertically {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int lastrow= wb.getSheet("MultipleData").getLastRowNum();
//		System.out.println(lastrow);
		for(int i=0;i<=lastrow;i++) {
			String data = wb.getSheet("MultipleData").getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
		}

	}

}
