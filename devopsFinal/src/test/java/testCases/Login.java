package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Login {
	
	WebDriver driver;
	
  @Test
  public void invokeBrowser() {
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://newtours.demoaut.com");
	  
	  driver.findElement(By.name("userName")).sendKeys("admin1");
	  driver.findElement(By.name("password")).sendKeys("admin@123");
	  driver.findElement(By.name("login")).click();
  }

  @BeforeMethod
  public void setDriver() {
	  System.setProperty("webdriver.chrome.driver","/Users/toddgroudan/Desktop/JavaPrograms/chromedriver");
	  driver = new ChromeDriver();
  }

  @AfterMethod
  public void teardown() {
	  driver.quit();
  }

}