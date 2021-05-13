package genericLibrary;

import java.io.File;
/*
 * ShraddhaBagoji
 */
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenShotUtil implements IAutoConstants {
	public void takeScreenShot(WebDriver driver,ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempFile=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(SCREENSHOT_PATH+result.getMethod().getMethodName()+".png");
		tempFile.renameTo(dest);
	}
}
