package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	@FindBy(xpath="//a[text()='Product Name']/../../..//a[text()='Vtiger 5 Users Pack']") 
	private WebElement product2;

	@FindBy(xpath="//a[text()='Product Name']/../../..//a[text()='Vtiger Single User Pack']")
	private WebElement product1;

	@FindBy(xpath="(//input[@name='Edit'])[1]")
	private WebElement edit;

	@FindBy(xpath="(//input[@name='Duplicate'])[1]")
	private WebElement duplicate;

	@FindBy(xpath="(//input[@name='Delete'])[1]")
	private WebElement delete;

	@FindBy(xpath="(//img[@name='privrecord'])[1]")
	private WebElement privrecord;

	@FindBy(xpath="(//img[@name='nextrecord'])[1]")
	private WebElement nextrecord;

	@FindBy(xpath="(//input[@value='  Save  '])[1]")
	private WebElement Save;

	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement ProductHeaderText;
	
    public WebElement getProductHeaderText() {
		return ProductHeaderText;
	}
	@FindBy(xpath="(//a[text()='Product Name']/../../..//a[text()='Vtiger 5 Users Pack'])[2]")
    private WebElement Product2Duplicates;
    
	@FindBy (xpath="//span[@id='dtlview_Product Name']")
	private WebElement deletingproduct;
	public WebElement getDeletingproduct() {
		return deletingproduct;
	}
	public WebElement getProduct2Duplicates() {
		return Product2Duplicates;
	}
//	public WebElement getProduct2DuplicatedText() {
//		return product2DuplicatedText;
//	}
//	public WebElement getProduct2DuplicateText() {
//		return product2DuplicateText;
//	}
//	public WebElement getProduct2InformationText() {
//		return Product2InformationText;
//	}
	public WebElement getSave() {
		return Save;
	}
	public WebElement getProduct1() {
		return product1;
	}
	public WebElement getProduct2() {
		return product2;

	}
	public WebElement getPrivrecord() {
		return privrecord;
	}
	public WebElement getNextrecord() {
		return nextrecord;
	}
	public WebElement getDuplicate() {
		return duplicate;

	}
	public WebElement getDelete() {
		return delete;
	}
	public WebElement getEdit() {
		return edit;
	}
	public ProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



}
