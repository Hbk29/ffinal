package Facebook;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logo {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.facebook.com/");
		
		
	TakesScreenshot ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		
		File folder=new File("C:\\Users\\Umesh Patil\\Desktop\\resume\\we.jpeg");
		
	   try {
		FileHandler.copy(src, folder);
	} catch (IOException e) {
	
		e.printStackTrace();
	}
		
	}

	//VERIFY LOGO TEXT
		@Test(priority=1)
		public void verifyLogoText1() {
			String k=driver.findElement(By.xpath("//img[@alt='Facebook']")).getText();
			
			System.out.println(k);
			
			Assert.assertTrue(true, "facebook");
		}
	
	
	
	//VERIFY LOGO IS DISPLAYED OR NOT
	   @Test(priority=2)
	       public void verifyLogoDisplayedTest() {
	       driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
	
	       Assert.assertTrue(true, "lOGO IS DISPLAYED");
	}


    @AfterMethod
    public void closeapp() {
    	driver.close();
    }


}