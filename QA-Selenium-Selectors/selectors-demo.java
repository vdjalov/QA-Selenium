package selenium;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	
    public static void main( String[] args ) throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\External JAVA JARS\\SELENIUM chrome driver\\chromedriver.exe");
    	
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.amazon.com/");
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    	
    	// Select by id
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung");
    	Thread.sleep(2000);
    	
    	// Select by css selector
    	driver.findElement(By.cssSelector("input[class='nav-input']")).click();
    	Thread.sleep(2000);
    	
    	// Select by linktext
    	driver.findElement(By.linkText("UGREEN")).click();
    	Thread.sleep(2000);
    	
    	// Select by attribute name
    	driver.findElement(By.name("field-keywords")).clear();
    	Thread.sleep(2000);
    	
    	// Select by partial link text - part of the element text
    	driver.findElement(By.partialLinkText("TNP")).click();
    	Thread.sleep(2000);
    	
    	// Select by Xpath
    	driver.findElement(By.xpath("//*[@id=\"p_89/Samsung Electronics\"]/span/a/span")).click();
    	Thread.sleep(2000);
    	
    	// Select by Class name
    	driver.findElement(By.className("icp-nav-link-inner")).click();
    	Thread.sleep(2000);
    	
    	
    	driver.navigate().to("https://www.ebay.com");
    	Thread.sleep(4000);
    	driver.navigate().back();
    	Thread.sleep(4000);
    	driver.quit();
    	
    }
}










