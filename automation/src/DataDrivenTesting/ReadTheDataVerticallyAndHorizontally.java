package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTheDataVerticallyAndHorizontally {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int data1 = wb.getSheet("MultipleData").getLastRowNum();
//		int data2 = wb.getSheet("Multipledata").getla
		for(int i=0;i<=data1;i++) {
			int hr = wb.getSheet("MultipleData").getRow(i).getLastCellNum();
//			System.out.println(hr);
			
		
		for(int j=0;j<hr;j++) {
			String hr1 = wb.getSheet("MultipleData").getRow(i).getCell(j).getStringCellValue();
			System.out.print(hr1+"  ");
		}
		System.out.println();
		}
		

	}

}
