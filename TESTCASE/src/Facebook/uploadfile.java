package Facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {

	public static void main(String[] args) throws Exception {
 //st the property and path of chrone browser and driver resp.
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		
		//launching chrome browser instance
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		//launch the app
		driver.get("https://www.foundit.in/");
		
		//maximise the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
	
		
		driver.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[2]/div[2]")).click();

		//1st way == Uploading File by using sendkeys
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Umesh Patil\\Desktop\\TC\\resume.docx");
	}

}
