package Tests;

import java.io.IOException;

import org.junit.Test;

import Base.TestBase;
import Pages.LandingPage;

public class Homepage extends TestBase {
	
	//@Test
	public void GetSubTitle() throws IOException 
	{
		driver = initialiseDriver();
		driver.get(getProperty("url"));
		driver.manage().window().maximize();
		LandingPage lp = new LandingPage(driver);
		System.out.print(lp.getSubTitle().getText());
		driver.quit();
	}
	
	@Test
	public void ClickRadioBtn() throws IOException 
	{
		driver = initialiseDriver();
		driver.get(getProperty("url"));
		driver.manage().window().maximize();
		LandingPage lp = new LandingPage(driver);
		lp.getXpopUpBtn().click();
		lp.getLoginBtn().click();
		lp.getUsernameBtn().sendKeys("abc");
		lp.getPasswordBtn().sendKeys("abc");
		lp.getSubmitBtn().click();
		driver.quit();
	}
	
	
	

}
