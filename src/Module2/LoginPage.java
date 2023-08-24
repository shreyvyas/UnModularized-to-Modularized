package Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void performLogin(String username, String password) {
		
		WebElement usernameLoginPage = driver.findElement(By.id("username"));
		usernameLoginPage.sendKeys(username);
		
		WebElement passwordLoginPage = driver.findElement(By.id("password"));
		passwordLoginPage.sendKeys(password);
		
		WebElement loginButton = driver.findElement(By.cssSelector(".css-177pwqq"));
		loginButton.click();		
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
