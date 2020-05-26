package holisol.qa.dms.pom.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	Properties prop;
	WebDriver driver;

	
	public WebDriver int_driver(Properties prop) {
	 String browserName1= prop.getProperty("browserName");
		
		if(browserName1.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().version("2.40").setup();
			 driver=new ChromeDriver();}
		else if (browserName1.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browserName1.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();	
			
			}
		
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://test.holisoldelivery.com");
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		return driver;
	}
		
		
		public Properties init_prop(){
			prop =new Properties();
			
			try {
				FileInputStream reader=new FileInputStream("C:\\Users\\holisol\\Music\\holisol.qa.dms.pom\\src\\main\\java\\holisol\\qa\\dms\\pom\\Config\\Config.properties");
			     try {
					prop.load(reader);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 	
			return prop;
		}
}

