package AssertingPKG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootStrapDropdown {

	public static WebDriver driver;
	@Test
	public void handleBootstrapdropdown()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		
		Point y= driver.findElement(By.xpath("//button[@id='menu1']")).getLocation();
		System.out.println(y);
		Point x= driver.findElement(By.xpath("//a[contains(text(),'HTML')]")).getLocation();
		driver.findElement(By.xpath("//a[contains(text(),'HTML')]")).click();
		
		
		System.out.println(x);
	}
}
