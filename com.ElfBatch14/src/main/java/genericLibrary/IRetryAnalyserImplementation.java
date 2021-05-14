package genericLibrary;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/*
 * DevikaPatel
 */
public class IRetryAnalyserImplementation implements IRetryAnalyzer {

	int count=0;
	int retryCount=2;

	public boolean retry(ITestResult result) {
		if(retryCount>=count) {
			count++;
			return true;
		}
		return false;
	}

}
