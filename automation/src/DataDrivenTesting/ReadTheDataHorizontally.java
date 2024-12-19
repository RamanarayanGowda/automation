package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTheDataHorizontally {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int lastcell = wb.getSheet("MultipleData").getRow(0).getLastCellNum();
		for(int i = 0;i<lastcell;i++) {
			String data = wb.getSheet("MultipleData").getRow(2).getCell(i).getStringCellValue();
			System.out.print(data +" ");
		}

	}

}
