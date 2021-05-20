package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
	WebDriver driver;
	public InvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(xpath="//img[@title='Create Invoice...']")
	private WebElement createNewInvoiceButton;

	@FindBy(xpath="//img[@title='Select' and contains(@onclick,'re')]")
	private WebElement organizationButton;

	@FindBy(xpath="//a[text()='Motorola']")
	private WebElement organizationNameLink; 

	@FindBy(xpath="//span[text()='Creating New Invoice']")
	private WebElement subTitleOfInvoice;

	@FindBy(id="productName1")
	private WebElement iteamName;

	@FindBy(id="qty1")
	private WebElement quantityTextField;

	@FindBy(xpath="//div[@align='center']/descendant::input[@type='submit']")
	private WebElement saveButton;

	@FindBy(name="subject")
	private WebElement subjectTextField;

	@FindBy(name="bill_street")
	private WebElement billingAddressTextField;

	@FindBy(name="ship_street")
	private WebElement shippingAddressTextField;

	@FindBy(id="single_accountid")
	private WebElement organizationName;

	@FindBy(xpath="//input[@value='T']")
	private WebElement userRadioButton;

	@FindBy(xpath="//td[text()='Organizations']")
	private WebElement organizationSubTitle;

	@FindBy(xpath="//td[text()='Products']")
	private WebElement ProductsSubTitle;


	@FindBy(id="searchIcon1")
	private WebElement iteamNameButton;

	@FindBy(name="invoicestatus")
	private WebElement statusDropDown;

	@FindBy(id="popup_product_128")
	private WebElement productNameLink;

	@FindBy(xpath="//span[contains(text(),'Invoice Information')]")
	private WebElement invoiceInformation;  

	@FindBy(xpath="//img[@title='Select' and contains(@onclick,'selectSales')]")
	private WebElement salesOrderButton;
	
	@FindBy(xpath="//td[contains(text(),'Sales Order')]")
	private WebElement saleOrderSubTitle;
	
	@FindBy(id="1")
	private WebElement salesSubject;
	
	@FindBy(xpath="//img[contains(@onclick,'selectContact')]")
	private WebElement contactNameButton;
	
	@FindBy(xpath="//td[text()='Contacts']")
	private WebElement contactSubTitle;
	
	@FindBy(xpath="//a[text()='Dipankar Deb']")
	private WebElement contactName;
	
	@FindBy(xpath="//font[text()='Stock is not enough']")
	private WebElement errorMesg;
	
	public WebElement getErrorMesg() {
		return errorMesg;
	}


	public WebElement getContactName() {
		return contactName;
	}


	public WebElement getContactSubTitle() {
		return contactSubTitle;
	}


	public WebElement getContactNameButton() {
		return contactNameButton;
	}


	public WebElement getSalesSubject() {
		return salesSubject;
	}


	public WebElement getSaleOrderSubTitle() {
		return saleOrderSubTitle;
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getSalesOrderButton() {
		return salesOrderButton;
	}


	public WebElement getInvoiceInformation() {
		return invoiceInformation;
	}


	public WebElement getProductNameLink() {
		return productNameLink;
	}

	public WebElement getStatusDropDown() {
		return statusDropDown;
	}

	public WebElement getIteamNameButton() {
		return iteamNameButton;
	}

	public WebElement getOrganizationSubTitle() {
		return organizationSubTitle;
	}

	public WebElement getCreateNewInvoiceButton() {
		return createNewInvoiceButton;
	}

	public WebElement getOrganizationButton() {
		return organizationButton;
	}

	public WebElement getProductsSubTitle() {
		return ProductsSubTitle;
	}

	public WebElement getOrganizationNameLink() {
		return organizationNameLink;
	}

	public WebElement getIteamName() {
		return iteamName;
	}

	public WebElement getQuantityTextField() {
		return quantityTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getSubjectTextField() {
		return subjectTextField;
	}

	public WebElement getBillingAddressTextField() {
		return billingAddressTextField;
	}

	public WebElement getShippingAddressTextField() {
		return shippingAddressTextField;
	}

	public WebElement getOrganizationName() {
		return organizationNameLink;
	}

	public WebElement getUserRadioButton() {
		return userRadioButton;
	}

	public WebElement getSubTitleOfInvoice() {
		return subTitleOfInvoice;
	}






}
