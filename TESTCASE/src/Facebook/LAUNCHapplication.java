package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LAUNCHapplication {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	//Test=verify with valid url application launch
	@Test
	public void appLaunchWithUrlTest() {
		driver.get("http://www.facebook.com/");
		Assert.assertTrue(true);
		
	}


	@AfterMethod
    public void closeapp() {
    	driver.close();
    }


}
