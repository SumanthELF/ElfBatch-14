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
	
	@FindBy(xpath="(//a[text()='Product Name']/../../..//a[text()='Vtiger 5 Users Pack'])[2]")
    private WebElement Product2Duplicates;
    
	@FindBy (xpath="//span[@id='dtlview_Product Name']")
	private WebElement deletingproduct;
	
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement createproduct;
	
	@FindBy(className="crmbutton.small.delete")
	private WebElement delete1;
	
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement Selectvendor;
	
	@FindBy(name="productname")
	private WebElement productname;
	
	@FindBy(id="productcode")
	private WebElement productcode;
	
	@FindBy(id="commissionrate")
	private WebElement commissionrate;
	
	@FindBy(id="unit_price")
	private WebElement unit_price;
    
	@FindBy(id="qty_per_unit")
	private WebElement qty_per_unit;
	
	@FindBy(id="qtyinstock")
	private WebElement qtyinstock;

	@FindBy(name="description") 
	private WebElement description;
	
	@FindBy(name="button") 
	private WebElement button;

	@FindBy(linkText="more currencies »")
	private WebElement more;
	
	@FindBy(name="usageunit")
	private WebElement usageunit;

	@FindBy(id="my_file_element")
	private WebElement file;
	
	public WebElement getProductHeaderText() {
		return ProductHeaderText;
	}
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
	public WebElement  getcreateproduct(){                  
		return  createproduct;
	}
	public WebElement getSelectvendor() {
		return Selectvendor;
	}
	public WebElement  getproductname(){                    
		return  productname;
	}
	public WebElement  getproductcode(){                    
		return   productcode ;
	}
	public WebElement  getcommissionrate(){                  
		return  commissionrate;
	}
	public WebElement  getunit_price(){                  
		return  unit_price;
	}
	public WebElement  getqty_per_unit(){                  
		return  qty_per_unit;
	}
	public WebElement  getqtyinstock(){                  
		return  qtyinstock;
	}
	public WebElement  getdescription(){                  
		return  description;
	}
	public WebElement getbutton() {                                         
		return button;
	}
	public WebElement getmore(){
		return more;
	}
	public WebElement getusageunit(){
		return usageunit;
	}
	public WebElement getmy_file_element(){
		return file;
	}
	
	public WebElement getdelete(){
		return delete1;
	}

	public ProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



}
