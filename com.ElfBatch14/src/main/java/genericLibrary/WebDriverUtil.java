package genericLibrary;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverUtil {
	WebDriver driver;
	public WebDriverUtil(WebDriver driver) {
		this.driver=driver;
	}
	public void passDriverControll(String title) {
		String parent=driver.getWindowHandle();
		Set<String> allWid=driver.getWindowHandles();
		allWid.remove(parent);
		for(String sessionID:allWid){
			driver.switchTo().window(sessionID);
			if(driver.getTitle().equals(title)){
				break;
			}
		}
		
	}
	public void passDriverControll(WebElement ele) {
		String parent=driver.getWindowHandle();
		Set<String> allWid=driver.getWindowHandles();
		allWid.remove(parent);
		for(String sessionID:allWid){
			driver.switchTo().window(sessionID);
			if(ele.isDisplayed()){
				break;
			}
		}
		
	}
}
