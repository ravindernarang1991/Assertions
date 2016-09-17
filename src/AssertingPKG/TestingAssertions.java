package AssertingPKG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class TestingAssertions {

	public static WebDriver driver;
	@Test
	public static void  assertion(){
		
		/*driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(driver.getTitle(),"gdfgfd","Hello");
		
		//System.out.println("Hunny good job");
		sa.assertEquals(2+2, 4, "Hunny");
		Reporter.log("HUNNY SINGH");
		sa.assertAll();
		
		
		
	}
	
}
