package genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/*
 *  @Author Rekha
 */
public class ActionsUtil {
	
	public WebDriver driver;
	public Actions actions= new Actions(driver);
	
	public void getMoveToElement(WebElement element) {
		actions.moveToElement(element).perform();
	}
	
	public void getMoveToCoOrdinate(WebElement element, int x, int y) {
		actions.moveToElement(element, x, y).perform();
	}
	
	public void getMoveByOffset(int x, int y) {
		actions.moveByOffset(x, y).perform();
	}
	
	public void getDragAndDrop(WebElement source, WebElement destination) {
		actions.dragAndDrop(source, destination).perform();
	}
	
	public void getDragAndDropBy(WebElement source, int x, int y) {
		actions.dragAndDropBy(source, x, y).perform();
	}
	
	public void getClickAndHold(WebElement source) {
		actions.clickAndHold(source).perform();
	}
	
	public void getRelease(WebElement source) {
		actions.release(source).perform();
	}
	
	public void  getDoubleClick(WebElement element) {
		actions.doubleClick(element).perform();
	}

	public void  getContextClick(WebElement element) {
		actions.contextClick(element).perform();
	}
	
	public void getClick(WebElement element) {
		actions.click(element).perform();
	}

}
