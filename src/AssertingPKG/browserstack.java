package AssertingPKG;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class browserstack {



  public static final String USERNAME = "ravindersingh13";
  public static final String AUTOMATE_KEY = "vRVZq3Asz46d2WyL75wc";
  public static final String URL = 
          
          "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

  public static void main(String[] args) throws Exception {

    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("browser", "Chrome");
    caps.setCapability("browser_version", "49.0");
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "XP");
    caps.setCapability("browserstack.debug", "true");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    driver.manage().window().maximize();
    driver.get("http://google.com");
    WebElement element = driver.findElement(By.name("q"));

    element.sendKeys("where i am");
    element.submit();

    System.out.println(driver.getTitle());
    driver.quit();

  }
}