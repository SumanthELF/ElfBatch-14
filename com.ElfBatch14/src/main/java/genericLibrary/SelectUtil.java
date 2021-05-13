package genericLibrary;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtil {
	/*
	 Jeevitha R
	 */
	
	public void SelectElement(WebElement element,String input) {
		Select select = new Select(element);
		if(input=="0") {
			select.selectByIndex(0);
		}
		List<WebElement> allOptions = select.getOptions();
		for(WebElement oneOption:allOptions) {
			String optionText=oneOption.getText();
			String optionValue=oneOption.getAttribute("value");
			try {
				if(input.equals(optionText)) {
					select.selectByVisibleText(input);
					break;
				}
				else if(input.equals(optionValue)) {
					select.selectByValue(input);
					break;
				}
			}
			catch(Exception e) {
				int index=Integer.parseInt(input);
				select.selectByIndex(index);
				break;
			}
		}
	}
}


