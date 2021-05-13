package genericLibrary;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation implements ITestListener{
	public void onFinish(ITestContext arg0) {
		Reporter.log("onFinish",true);
	}
	public void onStart(ITestContext arg0) {
		Reporter.log("onStart",true);
	}
	public void onTestFailedButWithinPercentage(ITestContext arg0) {
		Reporter.log("onTestFailedButWithinPercentage",true);
	}
	public void onTestFailure(ITestResult result) {

		Reporter.log("onTestFailure",true);
		Reporter.log(( result).getMethod().getMethodName(),true);
		TakeScreenshot screenshot = new TakeScreenshot();
		try {
			screenshot.getScreenShot(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult arg0) {
		Reporter.log("onTestSkipped",true);
	}
	public void onTestStart(ITestResult arg0) {
		Reporter.log("onTestStart",true);
	}

	public void onTestSuccess(ITestResult arg0) {
		Reporter.log("onTestSkipped",true);

	}
}
