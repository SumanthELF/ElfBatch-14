package contacts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import genericLibrary.BaseTest;

public class TC_11Test extends BaseTest {
	
	@Test(groups="one")
	public void createContact11() throws Exception {

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
		//Step 5: Enter mandatory values and select assigned to "Group" as a "Support group" from dropdown and save

		createnewcontactpage.getFirstname().sendKeys(excel.stringCellValue(EXCEL_PATH,"Contacts",3,0));
		createnewcontactpage.getLastname().sendKeys(excel.stringCellValue(EXCEL_PATH,"Contacts",3,1));
		createnewcontactpage.getAssigntyperadiobutton().click();
		createnewcontactpage.getDropdown().click();
		createnewcontactpage.getSupportgroup().click();
		createnewcontactpage.getButton().click();
		Assert.assertEquals(createnewcontactpage.getContactNewPageTitle().isDisplayed(),true, "contact is not created in Contact Information page");
		Reporter.log("contact is created with below msg"+"[ CON** ] devika patel - Contact Information   Updated today Contact name should be display",true);
		        
	}

}
