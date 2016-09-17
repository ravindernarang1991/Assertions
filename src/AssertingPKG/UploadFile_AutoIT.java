package AssertingPKG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadFile_AutoIT {

	
	public static WebDriver driver;
	@Test
	public static void  Upload() throws IOException, InterruptedException{
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/WorkSpace/TOOLS/AUTO%20IT/UploadFILE.html");
		
		driver.findElement(By.xpath("//input[@id='upload']")).click();
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\WorkSpace\\TOOLS\\AUTO IT\\UploadFile.exe");
}
	}
