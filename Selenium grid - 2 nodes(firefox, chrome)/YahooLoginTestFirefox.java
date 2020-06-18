package testing_pages;

import org.testng.annotations.Test;

import grid.DriverFactory;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class YahooLoginTestFirefox {
	
	private WebDriver firefoxDriver;
	private DriverFactory driverFactory;
	
	
  @Test
  public void testSignInFirefox() {
	  this.firefoxDriver = this.driverFactory.getFirefoxDriver("https://www.yahoo.com/");
	  
	  this.firefoxDriver.findElement(By.name("agree")).click();
	  this.firefoxDriver.findElement(By.id("header-signin-link")).click();
	  this.firefoxDriver.findElement(By.id("login-username")).sendKeys("divanov");
	  this.firefoxDriver.findElement(By.id("login-signin")).click();
  }
  
  @Test
  public void testgetTitleFirefox() throws InterruptedException {
	  this.firefoxDriver = this.driverFactory.getFirefoxDriver("https://www.yahoo.com/");
	  String title = this.firefoxDriver.getTitle();
	  System.out.println(title);
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  this.driverFactory = new DriverFactory();
  }

  @AfterMethod
  public void afterMethod() {
	  this.driverFactory.quitDriver();
  }

}
