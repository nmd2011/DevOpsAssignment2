package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class loginPage{
		WebDriver driver;
	
		
		public loginPage() {
		this.driver=driver;
	}
	
//Set the web element finders		
    By username = By.name("username");
	By password =By.name("password");
	By login = By.name("login");
	
	public void typeUsername(String email) {
		driver.findElement(username).sendKeys(email);
	}
	
	public void TypePassword(String code) {
		driver.findElement(password).sendKeys(code);
	}
	
	public void clickLogin() {
		driver.findElement(login).click();
	}
}
	  
	