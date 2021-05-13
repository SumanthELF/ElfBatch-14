package genericLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsLib {
	WebDriver driver;
	Actions actions = new Actions(driver);
	public void moveToElement(WebElement element,WebDriver driver) {
		actions.moveToElement(element).perform();
	}
	public void moveToElementCoOrd(WebElement element,int x,int y,WebDriver driver) {
		actions.moveToElement(element,x,y).perform();
	}
	public void moveByOffset(WebElement element,int x,int y,WebDriver driver) {
		actions.moveByOffset(x,y).perform();
	}
	
	public void dragAndDrop(WebElement source,WebElement destination,WebDriver driver) {
		actions.dragAndDrop(source,destination).perform();
	}
	
	public void dragAndDropBy(WebElement source,WebElement destination,int x,int y,WebDriver driver) {
		actions.dragAndDropBy(source,x,y).perform();
	}
	
	public void clickAndHold(WebElement source,WebDriver driver) {
		actions.clickAndHold(source).perform();
	}
	
	public void release(WebElement source,WebDriver driver) {
		actions.release(source).perform();
	
	}
}




