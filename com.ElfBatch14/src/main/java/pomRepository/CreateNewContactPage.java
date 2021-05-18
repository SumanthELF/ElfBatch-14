package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * Author DevikaPatel
 */

public class CreateNewContactPage {
	WebDriver driver;
	public CreateNewContactPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;

	}

	@FindBy(name="button")
	private WebElement button;

	public WebElement getButton() {
		return button;
	}

	@FindBy(name="lastname")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}

	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement plusbutton;

	public WebElement getPlusbutton() {
		return plusbutton;
	}
	
	@FindBy(xpath="//a[text()='vtiger']")
    private WebElement vtigerorganizationname;

	public WebElement getVtigerorganizationname() {
		return vtigerorganizationname;
	}
	
	@FindBy(xpath="//input[@name='account_name']")
	private WebElement organizationname;

	public WebElement getOrganizationname() {
		return organizationname;
	}

	@FindBy(xpath="//td[@class='moduleName']")
	private WebElement organization;

	public WebElement getOrganization() {
		return organization;
	}

	@FindBy(name="firstname")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}

	@FindBy(id="mouseArea_Last Name")
	private WebElement createdContact;

	public WebElement getCreatedContact() {
		return createdContact;
	}


	@FindBy(xpath="//input[@name='imagename']")
	private WebElement choosefile;

	public WebElement getChoosefile() {
		return choosefile;
	}

	@FindBy(xpath="//img[@alt='Import Contacts']")
	private WebElement importContact;

	public WebElement getImportContact() {
		return importContact;
	}

	@FindBy(xpath="//img[@src='themes/softed/images/select.gif' and contains(@onclick,'select')]")
	private WebElement reportButton;

	public WebElement getReportButton() {
		return reportButton;
	}

	@FindBy(xpath="//a[text()='devika patel']")
	private WebElement expectedContactName;

	public WebElement getExpectedContactName() {
		return expectedContactName;
	}

	@FindBy(xpath="//td[text()='Contacts']")
	private WebElement contactSubtitle;

	public WebElement getContactSubtitle() {
		return contactSubtitle;
	}

	@FindBy(xpath="//input[@value='T']")
	private WebElement assigntyperadiobutton;

	public WebElement getAssigntyperadiobutton() {
		return assigntyperadiobutton;
	}

	@FindBy(xpath="//span[contains(text(),'patel devika')]")
	private WebElement ContactNewPageTitle;

	public WebElement getContactNewPageTitle() {
		return ContactNewPageTitle;
	}

	@FindBy(xpath="//select[@name='assigned_group_id']")
	private WebElement dropdown;

	public WebElement getDropdown() {
		return dropdown;
	}

	@FindBy(id="import_file")
	private WebElement importchoosefile;

	public WebElement getImportchoosefile() {
		return importchoosefile;
	}

	@FindBy(xpath="//option[text()='Support Group']")
	private WebElement supportgroup;

	public WebElement getSupportgroup() {
		return supportgroup;
	}
}
