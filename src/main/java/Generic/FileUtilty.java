package Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtilty {

	public String getdata(String value) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Manish\\eclipse-workspace\\VTiger\\src\\test\\resources\\commondata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value1=pobj.getProperty(value);
		return value1;	
	}
}
