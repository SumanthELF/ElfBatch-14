package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//a[.='Organizations']")
	private WebElement organizationLink;

	public WebElement getorganizationLink()
	{
		return organizationLink;
	}
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createOrganizationImage;

	public WebElement getcreateOrganizationImage()
	{
		return createOrganizationImage;
	}

	@FindBy(xpath="//img[@title='Select']")
	private WebElement selectOrganization;

	public WebElement getselectOrganization()
	{
		return selectOrganization;
	}

	@FindBy(name="accountname")
	private WebElement OrganizationName;

	public WebElement getOrganizationName()
	{
		return OrganizationName;

	}
	@FindBy(xpath="//a[text()='vtigerCRM Inc']")
	private WebElement selectorgName;

	public WebElement getselectorgName()
	{
		return selectorgName;
	}
	@FindBy(xpath="//a[.='EDFG Group Limited']")
	private WebElement select2OrgName;

	public WebElement getselect2OrgName()
	{
		return select2OrgName;
	}



	@FindBy(xpath="//input[@title='Clear']")
	private WebElement clearButton;
	public WebElement getclearButton()
	{
		return clearButton;
	}

	@FindBy(name="button")
	private WebElement saveButton;

	public WebElement getsaveButton()
	{
		return saveButton;
	}
	@FindBy(xpath="//img[@src='themes/softed/images/Home.PNG']")
	private WebElement homeButton;
	public WebElement gethomeButton()
	{
		return homeButton;
	}



}
