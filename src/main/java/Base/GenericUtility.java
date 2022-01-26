package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GenericUtility {
	
	public String getProperty(String propVal) throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Tiaa\\Aishmagupta\\MySeleniumProject\\TestFramework\\data.properties");
		prop.load(fis);
		String propValue = prop.getProperty(propVal);
		return propValue;
	}

}
