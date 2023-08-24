package Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	//setup method
	public void openURL(){
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
	}
	
	//Test
	public void clickOnLogin() {		
		WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		
		if(loginButton.isDisplayed()) {
			System.out.println("Click on login button...test step is passed");
		}
		else {
			System.out.println("No login button present...test step is failed");
		}
		
		loginButton.click();		
	}
	
	//Test
	public void clickOnRegister() {		
		WebElement registerButton = driver.findElement(By.cssSelector(".css-177pwqq"));
		registerButton.click();		
	}
	
	//TearDown
	public void closeBrowser() {
		driver.quit();
	}

}
