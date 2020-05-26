package holisol.qa.dms.pom.TestCase;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import holisol.qa.dms.pom.Pages.LoginPage;
import holisol.qa.dms.pom.TestBase.TestBase;

public class LoginPageTest  {
	TestBase testbase;
	WebDriver driver;
	LoginPage loginpage;
	Properties prop;
	
	@BeforeTest
	public void setUp() {
		testbase=new TestBase();	
		prop=testbase.init_prop();
		driver=testbase.int_driver(prop);
		loginpage=new LoginPage(driver);
	}
	
	@Test
	public void doLoginTest() {
		loginpage.doLogin("admin@admin.com", "123@holisol");
		
		
	}

}
