package Module2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestCase {
	
	static String lastGenerateUserName;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome115\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Chrome115\\chrome-win64\\chrome.exe");
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		testCase01(driver);

	}
	
	public static void testCase01(WebDriver driver) throws IOException, InterruptedException {
		System.out.println("Test Case01 starts");
		TestUtils testUtils = new TestUtils(driver);
		testUtils.takesScreenshot("TestCase01", "HomePage");
		HomePage homePage = new HomePage(driver);
		homePage.openURL();
		System.out.println("Open URL");
		
		homePage.clickOnRegister();
		System.out.println("Click on Register");
		testUtils.takesScreenshot("TestCase01", "Register Page");
		
		RegisterPage register = new RegisterPage(driver);
		register.createUser("test", "test@123");
		testUtils.takesScreenshot("TestCase01", "New User Registration"); 
		
		lastGenerateUserName = register.lastgeneratedUserName;
		
		Thread.sleep(3000);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.performLogin(lastGenerateUserName, "test@123");
		
		loginPage.closeBrowser();
		System.out.println("Test Case ends.. browser is closed");
	}

}
