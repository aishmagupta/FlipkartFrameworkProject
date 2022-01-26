package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase extends GenericUtility {
	
	public WebDriver driver;
	
	public WebDriver initialiseDriver () throws IOException 
	{
		
		String browser = getProperty("browser");
		
		if (browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Tiaa\\Aishmagupta\\chromedriver_win32\\chromedriver.exe");  
			driver = new ChromeDriver();
		}
		else if (browser.equals("edge")) 
		{
			
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		
	}

}
