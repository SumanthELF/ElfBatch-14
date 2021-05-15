package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	@FindBy(linkText="del")
	private WebElement DeleteLink;
	
	public WebElement getDeleteLink() {
		return DeleteLink;
	}
	@FindBy(xpath="//input[@name='submit']")
	private WebElement SearchButton;
	
	@FindBy(id="161")
	private WebElement CheckBox;
	
	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getCheckBox() {
		return CheckBox;
	}
	@FindBy(id="bas_searchfield")
	private WebElement InDropDown;
	
	public WebElement getInDropDown() {
		return InDropDown;
	}

	@FindBy(xpath="//input[@name='search_text']") 
	private WebElement SearchForTextfield;
	
	public WebElement getSearchForTextfield() {
		return SearchForTextfield;
	}
	@FindBy(linkText="del")
	private WebElement delButton;
	
	public WebElement getDelButton() {
		return delButton;
	}
	@FindBy(name="button")
	private WebElement cancelButton;
	
	public WebElement getCancelButton() {
		return cancelButton;
	}
	@FindBy(xpath="//span[@class=\"lvtHeaderText\"]")
	private WebElement title; 
	
	public WebElement getTitle() {
		return title;
	}
	@FindBy(xpath="//img[contains(@src,'themes/softed/images/btnL3Add.gif')]")
	private WebElement  createLeadButton;
	
	public WebElement getCreateLeadButton() {
		return createLeadButton;
	}
	@FindBy(name="salutationtype")
	private WebElement firstNameDropDown;
	
	public WebElement getFirstNameDropDown() {
		return firstNameDropDown;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getLeadSourceDropDown() {
		return leadSourceDropDown;
	}

	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}

	public WebElement getAnnualRevenueTextField() {
		return annualRevenueTextField;
	}

	public WebElement getNoOfEmployeeTextfield() {
		return noOfEmployeeTextfield;
	}

	public WebElement getSecondaryemailTextField() {
		return secondaryemailTextField;
	}

	public WebElement getLeadNotextfield() {
		return leadNotextfield;
	}

	public WebElement getPhoneTextField() {
		return phoneTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getFaxTextField() {
		return faxTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getWebsiteTextField() {
		return websiteTextField;
	}

	public WebElement getLeadStatusDropDown() {
		return leadStatusDropDown;
	}

	public WebElement getRatingDropDown() {
		return ratingDropDown;
	}

	public WebElement getAssignedToDropDown() {
		return assignedToDropDown;
	}

	public WebElement getAssignTypeRadioButton() {
		return assignTypeRadioButton;
	}

	public WebElement getAssignTypeRadioButton1() {
		return assignTypeRadioButton1;
	}

	public WebElement getStreetTextField() {
		return streetTextField;
	}

	public WebElement getPoboxTextField() {
		return poboxTextField;
	}

	public WebElement getPostalcodeTextField() {
		return postalcodeTextField;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getCountryTextField() {
		return countryTextField;
	}

	public WebElement getStateTextField() {
		return stateTextField;
	}

	public WebElement getDescriptionTextField() {
		return descriptionTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	@FindBy(name="firstname")
	private WebElement firstNameTextField;
	
	@FindBy(name="lastname")
	private WebElement lastNameTextField;
	
	@FindBy(name="company")
	private WebElement companyTextField;
	
	@FindBy(name="designation")
	private WebElement titleTextField;
	
	@FindBy(name="leadsource")
	private WebElement leadSourceDropDown;
	
	@FindBy(name="industry")
	private WebElement industryDropDown;
	
	@FindBy(name="annualrevenue")
	private WebElement annualRevenueTextField;
	
	@FindBy(name="noofemployees")
	private WebElement noOfEmployeeTextfield;
	
	@FindBy(name="secondaryemail")
	private WebElement secondaryemailTextField;
	
	@FindBy(id="lead_no")
	private WebElement leadNotextfield;
	
	@FindBy(id="phone")
	private WebElement phoneTextField; 
	
	@FindBy(id="mobile")
	private WebElement mobileTextField;
	
	@FindBy(id="fax")
	private WebElement faxTextField;
	
	@FindBy(id="email")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement  websiteTextField;
	
	@FindBy(name="leadstatus")
	private WebElement leadStatusDropDown;
	
	@FindBy(name="rating")
	private WebElement ratingDropDown;
	
	@FindBy(name="assigned_user_id")
	private WebElement assignedToDropDown;
	
	@FindBy(xpath="//input[@value='U']")
	private WebElement assignTypeRadioButton;
	
	@FindBy(xpath="//input[@value='T']")
	private WebElement assignTypeRadioButton1;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement streetTextField;
	
	@FindBy(name="pobox")
	private WebElement poboxTextField;
	
	@FindBy(id="code")
	private WebElement postalcodeTextField;
	
	@FindBy(id="city")
	private WebElement cityTextField;
	
	@FindBy(id="country")
	private WebElement countryTextField;
	
	@FindBy(id="state")
	private WebElement stateTextField;
	
	@FindBy(name="description")
	private WebElement descriptionTextField;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement saveButton;
	
}
