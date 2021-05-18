package genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/***
 * 
 * @author Rekha
 *
 */
public class ActionsUtil {

	public WebDriver driver;
	public Actions actions= new Actions(driver);

	public void moveToElement(WebElement element) {
		actions.moveToElement(element).perform();
	}

	public void moveToElementCoOrdinates(WebElement element, int x, int y) {
		actions.moveToElement(element, x, y).perform();
	}

	public void moveByOffset(int x, int y) {
		actions.moveByOffset(x, y).perform();
	}

	public void dragAndDrop(WebElement source,WebElement dest) {
		actions.dragAndDrop(source, dest).perform();
	}

	public void dragAndDropBy(WebElement source, int x, int y) {
		actions.dragAndDropBy(source, x, y).perform();
	}

	public void clickAndHold(WebElement source) {
		actions.clickAndHold(source).perform();
	}

	public void release(WebElement source) {
		actions.release(source).perform();
	}

	public void  doubleClick(WebElement element) {
		actions.doubleClick(element).perform();
	}

	public void  contextClick(WebElement element) {
		actions.contextClick(element).perform();
	}

	public void click(WebElement element) {
		actions.click(element).perform();
	}

}
