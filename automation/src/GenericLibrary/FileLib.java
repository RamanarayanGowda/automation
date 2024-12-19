package GenericLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this is generic class which is having generic methods to read
 * and write data for property file and excel file
 * @author nanu
 */

public class FileLib {

//	public static void main(String[] args) {
		//data/ TODO Auto-generated method stub
		/**
		 * this is a generic method which is used to read data from
		 * @paramkey
		 * @return it will return the value associated with the mentioned key
		 * @throws IOException
		 */
		public String getPropertyData(String key) throws IOException {
			FileInputStream fis = new FileInputStream("./data/commondata.properties");
			Properties p = new Properties();
			p.load(fis);
			String data=p.getProperty(key);
			
			return data;
		}
		
		public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
			FileInputStream fis= new FileInputStream("./data/testScript.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		}
		public void setExcelData(String sheetname,int row,int cell,String value) throws EncryptedDocumentException, IOException {
			FileInputStream fis= new FileInputStream("./data/testScriptr.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
			FileOutputStream fos=new FileOutputStream("./data/testScripts.xlsx");
			wb.write(fos);
			
		}

	}


