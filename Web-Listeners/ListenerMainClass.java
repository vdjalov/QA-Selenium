package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ListenerMainClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\External JAVA JARS\\SELENIUM chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
		eventHandler.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		eventHandler.navigate().to("https://www.edureka.co/blog/");
		eventHandler.manage().window().maximize();
		Thread.sleep(3000);
		eventHandler.findElement(By.id("wzrk-cancel")).click();
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		eventHandler.findElement(By.linkText("Software Testing")).click();
		Thread.sleep(3000);
		eventHandler.navigate().to("https://www.edureka.co/all-courses");
		Thread.sleep(2000);
		eventHandler.navigate().back();
		eventHandler.quit();
	}
}
