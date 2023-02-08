package Genric_lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToReadData {
	public static String fromPropertyFile(String key) throws IOException {
		Properties pr=null;
		FileInputStream fis;
		try {
			fis=new FileInputStream(new File("./src/test/resources/TestData/confi.properties"));
			pr=new Properties();
			pr.load(fis);
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return pr.getProperty(key.toString());
		
	}
	

}
