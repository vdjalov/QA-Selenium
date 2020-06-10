package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\External JAVA JARS\\SELENIUM chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/OK/eclipse-workspace-03-2019/selenium/src/main/java/selenium/alerts.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alert")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.id("popWindow")).click();
		Robot robot = new Robot();
		robot.mouseMove(500, 5);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		driver.quit();
		
	}
}
