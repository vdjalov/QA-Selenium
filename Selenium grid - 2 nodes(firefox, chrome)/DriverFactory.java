package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
	
	  private WebDriver driver;
	  private static String dellNodeUrl = "http://192.168.2.102:2401/wd/hub"; // change every time new connection is established
	  private static String asusNodeUrl = "http://192.168.2.101:4989/wd/hub"; 
	  
	  
	  
	  public WebDriver getWebChromeDriver(String webUrl) {
		  
		try {
		  DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
		  desiredCapabilities.setBrowserName("chrome");
		  desiredCapabilities.setPlatform(Platform.WINDOWS);
		  
		  driver = new RemoteWebDriver(new URL(this.dellNodeUrl), desiredCapabilities);
		  driver.manage().deleteAllCookies();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		  driver.get(webUrl);
		} catch (MalformedURLException e) {
			System.out.println("Wrong node URL!");
		}
		return driver;
	  }

	  
	  public WebDriver getFirefoxDriver(String webUrl) {
		  
			try {
			  DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
			  desiredCapabilities.setBrowserName("firefox");
			  desiredCapabilities.setPlatform(Platform.WINDOWS);
			  
			  driver = new RemoteWebDriver(new URL(this.asusNodeUrl), desiredCapabilities);
			  driver.manage().deleteAllCookies();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			  driver.get(webUrl);
			} catch (MalformedURLException e) {
				System.out.println("Wrong node URL!");
			}
			return driver;
		  }
	  
	  
	  
	  
	  
	public void quitDriver() {
		this.driver.quit();
	}
	  

}
