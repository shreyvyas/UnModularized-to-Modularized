package Module1;            //Module1 is simple way to modularize the code

import java.time.Duration;

import org.openqa.selenium.WebDriver;
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
		
		testCase01(driver);
		
	}
	
	public static void testCase01(WebDriver driver) {
		
		System.out.println("Test Case01 starts");
		HomePage homePage = new HomePage(driver);
		homePage.openURL();
		System.out.println("Open URL");
		homePage.clickOnLogin();
		System.out.println("Click on Login");
		homePage.closeBrowser();
		System.out.println("Test Case ends.. browser is closed");
		
	}

}
