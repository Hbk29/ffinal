import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyPageTitle {
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com/");
	}
	
	@Test
	public void VerifyTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Facebook – log in or sign up","PASS");
		//Asser.assertEqual(String actual, String excepeted);

		
	}
	
	
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}
