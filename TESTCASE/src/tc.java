import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tc {
    
WebDriver driver;

@BeforeMethod
public void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 driver.manage().deleteAllCookies();
	driver.get("http://www.freecrm.com/");
	}

@Test
public void verifypageTitleTest() {
	String s=driver.getTitle();		
	System.out.println("page title="+s);
	
	Assert.assertEquals(s,"free crm software");
}



@AfterMethod
public void terminate() {
driver.close();

}

}
