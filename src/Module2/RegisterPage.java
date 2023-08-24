package Module2;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	
	WebDriver driver;
	String lastgeneratedUserName;
	
	RegisterPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void createUser(String userName, String password) {
		
		WebElement userName_box = driver.findElement(By.id("username"));
		
		UUID uuid = UUID.randomUUID();
		
		String testData_userName = userName + "" + uuid;
		lastgeneratedUserName = testData_userName;		
		userName_box.sendKeys(testData_userName);
		
		WebElement password_box = driver.findElement(By.id("password"));
		password_box.sendKeys(password);
		
		WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
		confirmPassword.sendKeys(password);
		
		WebElement registerButton = driver.findElement(By.cssSelector(".css-177pwqq"));
		registerButton.click();
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
