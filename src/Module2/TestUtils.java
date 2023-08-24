package Module2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtils {
	
	WebDriver driver;
	
	TestUtils(WebDriver driver){
		this.driver = driver;
	}
	
	public void takeScreenShot() throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Shrey\\eclipse-workspace\\TestNG\\ScreenShots\\screenshot.png");
		FileUtils.copyFile(src, dest);
		
	}
	
	public void takesScreenshot(String testCaseNo, String description) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String fileName = String.format("screenshot_%s_%s.png", testCaseNo, description);
		
		File dest = new File("ScreenShots/" + fileName);
		
		FileUtils.copyFile(src,  dest);
		
	}
	
	

}
