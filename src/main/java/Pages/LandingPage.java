package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.GenericUtility;

public class LandingPage extends GenericUtility {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	By uernameTxtBx = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	By passwordTxtBx = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	By submitBtn = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span");
	By searchTxt = By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
	By loginBtn = By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a");
	By XpopUpBtn = By.xpath("/html/body/div[2]/div/div/button");
	


	public WebElement getXpopUpBtn() { return driver.findElement(XpopUpBtn); }
	
	public WebElement getLoginBtn() { return driver.findElement(loginBtn); }

	public WebElement getUsernameBtn() { return driver.findElement(uernameTxtBx); }
	
	public WebElement getPasswordBtn() { return driver.findElement(passwordTxtBx); }
		
	public WebElement getSubmitBtn() { return driver.findElement(submitBtn); }
	
	public WebElement getSubTitle() { return driver.findElement(searchTxt); }

}
