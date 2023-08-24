package unModularizedTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome115\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Chrome115\\chrome-win64\\chrome.exe");
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		
		if(loginBtn.isDisplayed()) {
			System.out.println("Login button is displayed");
		}
		else {
			System.out.println("Login button is not displayed");
		}
		
		loginBtn.click();
		
		driver.quit();
	}

}
