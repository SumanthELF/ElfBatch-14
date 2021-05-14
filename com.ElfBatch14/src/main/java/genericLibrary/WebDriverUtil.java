package genericLibrary;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * Author NAMRATAKUMSI
 */
public class WebDriverUtil {
	WebDriver driver;
	public WebDriverUtil(WebDriver driver) {
		this.driver=driver;
	}
	public void switchToASpecificTitledWindow(String title) {
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
	public void switchToASpecificWindow(WebElement element) {
		String parent=driver.getWindowHandle();
		Set<String> allWid=driver.getWindowHandles();
		allWid.remove(parent);
		for(String sessionID:allWid){
			driver.switchTo().window(sessionID);
			if(element.isDisplayed()){
				break;
			}
		}
	}
}
