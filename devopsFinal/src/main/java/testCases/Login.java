package testCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.loginPage;


public class Login {
	WebDriver driver;

	 
  @Test
  public void invokeBrowser() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","/Users/toddgroudan/Desktop/JavaPrograms/chromedriver");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://newtours.demoaut.com");
	  
	  // create object for loginpage
	  loginPage login = new loginPage(driver);

	  //acces the method from the login page
	  login.login("admin1", "admin@123");
	  }

	  
	
  @AfterMethod
  public void teardown() {
	  driver.quit();
  }
 }
