package testing_pages;

import org.testng.annotations.Test;

import grid.DriverFactory;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;



public class YahooLoginTestChrome {
	
  private DriverFactory driverFactory; 
  private WebDriver chromeDriver;
  
  @Test
  public void testSignInChrome() throws InterruptedException {
	  this.chromeDriver = this.driverFactory.getWebChromeDriver("https://www.yahoo.com/");
	  this.chromeDriver.findElement(By.name("agree")).click();
	  this.chromeDriver.findElement(By.id("header-signin-link")).click();
	  this.chromeDriver.findElement(By.id("login-username")).sendKeys("divanov");
	  this.chromeDriver.findElement(By.id("login-signin")).click();
	
	  
  }
  
  
  @Test
  public void testGetTitleChrome() throws InterruptedException {
	  this.chromeDriver = this.driverFactory.getWebChromeDriver("https://www.yahoo.com/");
	  String title = this.chromeDriver.getTitle();
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
