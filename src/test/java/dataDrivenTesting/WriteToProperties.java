package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProperties {
public static void main(String[] args) throws IOException  {
	FileInputStream fis=new FileInputStream("./src/main/resources/Data.properties");
	Properties property=new Properties();
	property.load(fis);
	property.put("subject", "selenium");
	FileOutputStream fos=new FileOutputStream("./src/main/resources/Data.properties");
	property.store(fos, "updated successfully");
	
}
}
