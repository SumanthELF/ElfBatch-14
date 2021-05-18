package genericLibrary;

import org.testng.ITestContext;
/*
 * ShraddhaBagoji
 */
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseTest implements ITestListener {
	public void onFinish(ITestContext arg0) {					
		Reporter.log("onFinish",true);				

	}			
	public void onStart(ITestContext arg0) {					
		Reporter.log("onStart",true);				

	}			 
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
		Reporter.log("onTestFailedButWithinSuccessPercentage",true);			

	}			   		
	public void onTestFailure(ITestResult result) {					
		Reporter.log("Test script is Failed",true);	
		TakeScreenShotUtil screenshot=new TakeScreenShotUtil();
		screenshot.takeScreenShot(driver,result);  		
	}		

	public void onTestSkipped(ITestResult arg0) {					
		Reporter.log("onTestSkipped",true);	

	}		

	public void onTestStart(ITestResult arg0) {					
		Reporter.log("onTestStart",true);			

	}		
	public void onTestSuccess(ITestResult arg0) {					
		Reporter.log("onFinish",true);				

	}
}
