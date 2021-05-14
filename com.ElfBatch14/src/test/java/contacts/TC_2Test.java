package contacts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;

public class TC_2Test extends BaseTest{


	@Test(groups="one")
	public void TC_2() throws Exception {

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

		//================================================================================================================================
		//Step 5: Enter mandatory values and click on "Organization name" look-up image
		
		createnewcontactpage.getFirstname().sendKeys(excel.stringCellValue(EXCEL_PATH,"Contacts",1,0));
		createnewcontactpage.getLastname().sendKeys(excel.stringCellValue(EXCEL_PATH,"Contacts",1,1));
		createnewcontactpage.getPlusbutton().click();
		Assert.assertEquals(createnewcontactpage.getOrganization().isDisplayed(),true,"organization page is not displayed");
		Reporter.log("orgnaization page is displayed successfully",true);

		//================================================================================================================================
		//Step 6: select the existing "organization name" from the organization list page

		createnewcontactpage.getPlusbutton().click();
		webUtil.switchToASpecificTitledWindow(null);
		createnewcontactpage.getVtigerorganizationname().click();
		driver.switchTo().window(parent);
		Assert.assertEquals(createnewcontactpage.getOrganizationname().isDisplayed(),true,"organization name is not displayed successfully");
		Reporter.log("organization name is displayed successfully",true);

		//========================================================================================================================================
		//Step 6: Click on save button

		createnewcontactpage.getButton().click();
		Assert.assertEquals(createnewcontactpage.getCreatedContact().isEnabled(),true,"Contact is not created succcessfully");
		Reporter.log("Contact is created successfully",true);


	}
}
