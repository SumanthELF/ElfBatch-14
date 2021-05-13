package genericLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

public class TakeScreenshot {
	public void getScreenShot(ITestResult result) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)BaseTest.driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./errorshots/"+result.getMethod().getMethodName()+".png");
		FileUtils.copyFile(tempfile, destfile);
	}
}
