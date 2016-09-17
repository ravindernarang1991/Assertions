package AssertingPKG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {

	public static WebDriver driver;
	
	public static void  main(String args[]) throws InterruptedException, IOException{
		
		/*driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/WorkSpace/TRY.html");
		Thread.sleep(5000);
		driver.switchTo().frame(1);
	WebElement learnphp=	driver.findElement(By.xpath("//a[.='LEARN PHP']"));
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", learnphp);
	
	Thread.sleep(2000);
	js.executeScript("arguments[0].setAttribute('style',arguments[1]);", learnphp,"border: 5px dotted red");
	
	TakesScreenshot tk= (TakesScreenshot)driver;
	 File Src=tk.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Src, new File(".\\Screenshot\\Screenshot1.jpg"));
	
	learnphp.click();
	
	driver.quit();
		
}
}