package contacts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;

public class TC_4Test extends BaseTest{

	@Test(groups="one")
	public void TC_4() throws Exception {

		//============================================================================================================================
		//Step 3: Place the mouse cursor and click on "Contact" link

		homepage.getContacts().click();
		Assert.assertEquals(driver.getTitle(),"Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM","Contact list page is not displayed");
		Reporter.log("Contact list page is displayed",true);

		//================================================================================================================================
		//Step 4: navigate to "create new contact" page by click on "+" image

		contactpage.getPlusImage().click();
		Assert.assertEquals(driver.getTitle(),"Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM","create new contact page is not displayed");
		Reporter.log("create new contact page is displayed",true);

		//===============================================================================================================================
		//Step 5: Enter mandatory values and click on "Report" lookup image

		createnewcontactpage.getFirstname().sendKeys(excel.stringCellValue(EXCEL_PATH,"Contacts",2,0));
		createnewcontactpage.getLastname().sendKeys(excel.stringCellValue(EXCEL_PATH,"Contacts",2,1));
		createnewcontactpage.getReportButton().click();
		webUtil.switchToASpecificTitledWindow(null);
		Assert.assertEquals(createnewcontactpage.getContactSubtitle().isDisplayed(),true,"contact page is not displayed");
		Reporter.log("contact page is displayed",true);
		
		//===============================================================================================================================
		//Step 6:select the Existing contact from the contact list Page
		
		String existingName = "devika patel";
		String expectedName = createnewcontactpage.getExpectedContactName().getText();
		Assert.assertEquals(existingName.toLowerCase(),expectedName.toLowerCase(),"contact name is not displayed in contact information Page");
		Reporter.log("contact name is displayed in contact information Page",true);
		driver.close();
		driver.switchTo().window(parent);
		createnewcontactpage.getButton().click();
		Assert.assertEquals(createnewcontactpage.getContactNewPageTitle().isDisplayed(),true,"contact is not created in Contact Information page");
		Reporter.log("contact is created with below msg"+"[ CON** ] devika patel - Contact Information   Updated today Contact name should be display",true);


	}
}