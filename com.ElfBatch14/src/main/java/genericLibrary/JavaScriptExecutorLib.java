package genericLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorLib {
	/*
	 Jeevitha R
	 */

	WebDriver driver;
	JavascriptExecutor javaScript = (JavascriptExecutor) driver;
	public void click(WebElement element) {
		javaScript.executeScript("arguments[0].click();", element);
	}

	public void sendValue(String data,WebElement element) {
		javaScript.executeScript("arguments[0].value='data';", element);
	}

	public void scrollIntoView(boolean a,WebElement element) {
		javaScript.executeScript("arguments[0].scrollIntoView(a)",element);
	}

	public void scrollTo(int x,int y,WebElement element) {
		javaScript.executeScript("arguments[0].scrollTo(x,y)",element);
	}

	public Object returnValue(WebElement element) {
		Object value= javaScript.executeScript("return arguments[0].value",element);
		return value;
	}
}

