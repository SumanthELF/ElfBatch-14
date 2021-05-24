package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProductPage {
	public CreateNewProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

  @FindBy(name="productname")
  private WebElement productName;

  @FindBy(name="button")
  private WebElement saveButton;
  
  public WebElement getProductName() {
	  return productName;
  }

   public WebElement getSaveButton() {
	return saveButton;
   }
   
 }
  
  

