import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLogoText {
	WebDriver driver;
	@Test
	public void verifyLogoTest() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com/");
		
		
		WebElement k=driver.findElement(By.xpath("//*[@alt='Facebook']"));
		
		String h=k.getText();
		Assert.assertEquals(h,"facebook");
		
		
		
	}

}
