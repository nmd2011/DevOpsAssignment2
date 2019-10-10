package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class flightFinder {
	
	WebDriver driver;
	//Set the web element Locators		
		    By username = By.name("userName");
			By password =By.name("password");
			By login = By.name("login");
			
 public flightFinder(WebDriver driver1) {
		
		}
		

		
		public void typeUsername(String email) {
			Select to = new Select(driver.findElement(.))
			driver.findElement(username).sendKeys(email);
		}
		
		public void typePassword(String code) {
			driver.findElement(password).sendKeys(code);
		}
		
		public void clickLogin() {
			driver.findElement(login).click();
		}

		  
		public void login(String email,String code ) throws InterruptedException {
			typeUsername(email);
			typePassword(code);
			clickLogin();
		
	}	

}
