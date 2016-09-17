package AssertingPKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepAheadFrame {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://stepahead.timesjobs.com/ecm/myCart.html");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#proceedMisSelling")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.cssSelector("#GB_frame1")));
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.cssSelector("#GB_frame")));
		Thread.sleep(5000);
	String text=	driver.findElement(By.xpath("//label[@class='chk']//parent::li")).getText();
	System.out.println(text);
	
	driver.findElements(By.xpath("//a[.='PROCEED TO PAY']")).get(1).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
