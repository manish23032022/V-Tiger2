package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilty {
	
	public String getdata() throws IOException {
		FileInputStream fis=new FileInputStream("path");
		Workbook wb=WorkbookFactory.create(fis);
		//Sheet sh=wb.getSheetAt(1);
		return null;
		
	}
	
	

}
