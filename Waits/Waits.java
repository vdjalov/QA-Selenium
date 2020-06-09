package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\External JAVA JARS\\SELENIUM chrome driver\\chromedriver.exe");
    	
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // Fluent wait - will wait for the page to load. if not it will throw an error. 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  // Implicit wait - will wait for an element to load before throwing an error. GLOBAL	 
    	
    	WebElement firstName = driver.findElement(By.name("firstname"));
    	WebElement lastName = driver.findElement(By.name("lastname"));
    	
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	
    	wait.until(ExpectedConditions.visibilityOf(firstName)); // explicit wait - until an element is loaded 
    	firstName.sendKeys("Vlad");
    	
    	wait.until(ExpectedConditions.visibilityOf(lastName));
    	lastName.sendKeys("in the system");
    	
	}

}
