import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class login {
	WebDriver driver;
	@Test
	public void loginTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("54685");
		
		driver.findElement(By.name("login")).click();
		
		String k=driver.getTitle();
		System.out.println(k);
		
			
	}

}
