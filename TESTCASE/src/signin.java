import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class signin {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		
	}
	
	@Test
	public void signin() {
		driver.findElement(By.name("firstname")).sendKeys("ajay");
		driver.findElement(By.xpath("//*[@id=\"u_2_g_vX\"]")).sendKeys("54685");
		
		
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}

}
