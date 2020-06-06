package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathFunctions {

	
	 public static void main( String[] args ) throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\External JAVA JARS\\SELENIUM chrome driver\\chromedriver.exe");
	    	
	    	WebDriver driver = new ChromeDriver();
	    	driver.get("https://www.yahoo.com/"); 
	    	driver.manage().window().maximize();
	    	Thread.sleep(2000);	
	    	driver.findElement(By.xpath("//button[contains(@class,'btn primary')]")).click();
	    	Thread.sleep(2000);	
	    	boolean img = driver.findElement(By.xpath("//img[starts-with(@src,'https://s.yimg.com')]")).isDisplayed();
	    	
	    	if(img) {
	    		System.out.println("Img selected.");
	    	} else {
	    		System.out.println("Img not selected.");
	    	}
	    	
	    	Thread.sleep(2000);
	    	driver.findElement(By.linkText("Mail")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.linkText("Sign in")).click();;
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath("//input[contains(@id,'login-username')]")).sendKeys("my@email.com");
	    	Thread.sleep(1000);
	    	driver.findElement(By.xpath("//input[contains(@value,'Next')]")).click();
	    	driver.quit();
	    	
	 }
}
