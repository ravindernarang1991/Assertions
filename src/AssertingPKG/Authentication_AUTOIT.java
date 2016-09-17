package AssertingPKG;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Authentication_AUTOIT {





	
	public static WebDriver driver;
	@Test
	public static void  Upload() throws IOException, InterruptedException{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.engprod-charter.net/");
		
		
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\WorkSpace\\TOOLS\\AUTO IT\\Authentication.exe");
}
	}
