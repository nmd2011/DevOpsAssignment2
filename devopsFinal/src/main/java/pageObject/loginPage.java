package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class loginPage{
		WebDriver driver;
//Set the web element Locators		
	    By username = By.name("userName");
		By password =By.name("password");
		By login = By.name("login");
	
		
public loginPage(WebDriver driver1) {
		this.driver=driver1;
	}
	

	
	public void typeUsername(String email) {
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