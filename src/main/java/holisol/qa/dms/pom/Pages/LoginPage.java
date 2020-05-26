package holisol.qa.dms.pom.Pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import holisol.qa.dms.pom.TestBase.TestBase;

public class LoginPage extends TestBase{
	
	 WebDriver driver;
	 Properties prop;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	By username=By.xpath("//input[@name='email']");
	
	By password=By.xpath("//input[@type='password']");
	
	By loginbutton=By.xpath("//input[@value='Login']");
	
	public void doLogin(String username,String password) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(this.username).sendKeys(username);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(this.password).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(this.loginbutton).click();	
	}
	
	
	
	

}
