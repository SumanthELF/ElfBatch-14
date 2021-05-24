package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {

		public ProductListPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement newProduct;

	public WebElement getNewProduct() {
		return newProduct;
	}

 
  }


