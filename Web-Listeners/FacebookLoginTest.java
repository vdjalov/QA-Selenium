package selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;

public class FacebookLoginTest {
	
  private WebDriver driver;
  private EventFiringWebDriver eventHandler;
  
  
  @BeforeMethod
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\External JAVA JARS\\SELENIUM chrome driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  eventHandler = new EventFiringWebDriver(this.driver);
	  eventHandler.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  eventHandler.navigate().to("https://www.ebay.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
  
  @Test
  public void testSearchField() throws InterruptedException {
	  eventHandler.findElement(By.id("gh-ac")).sendKeys("samsung");
	  eventHandler.findElement(By.id("gh-btn")).click();
	  WebElement result = eventHandler.findElement(By.xpath("//*[text()=' results for ']"));
	  System.out.println(result);
	  Assert.assertNotNull(result);
  }
  
  @Test
  public void testSearchFieldDifferentResult() throws InterruptedException {
	  eventHandler.findElement(By.id("gh-ac")).sendKeys("laptop");
	  eventHandler.findElement(By.id("gh-btn")).click();
	  WebElement result = eventHandler.findElement(By.xpath("//*[text()=' results for ']"));
	  System.out.println(result);
	  Assert.assertNotNull(result);
  }
	
  @Test
  public void testThatIsSetToFail() {
	  System.out.println("This method to test fail");					
	    Assert.assertTrue(false);		
  }

 

  
 
}
