package contacts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.ExportContactPage;

/*
 *  @Author Rekha V
 */
public class Tc_6Test extends BaseTest{

	@Test(groups="smoke")
	public void createContactWhileSelectingOnExportContacts() throws Exception{

		//		Place the mouse cursor and click on Contact Link
		//		============================================================================================================================================================

		homepage.getContacts().click();
		String expectedContactListTitle = "Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM";
		String actualContactListTitle = driver.getTitle();
		Assert.assertEquals(expectedContactListTitle, actualContactListTitle, "Contact List page should Not be display");
		Reporter.log("Contact List page should be display",true);

		//		naviagate to create new Contact page by click on + image
		//		============================================================================================================================================================

		contactpage.getPlusImage().click();
		String expectedtitle = "Creating New Contact";
		String actualTitle = contactpage.getContactInformation().getText();
		Assert.assertEquals(actualTitle, expectedtitle, "Creating New Contact should not be display");
		Reporter.log("Creating New Contact should be display",true);

		//		Enter mandatory values & click on "Export contacts"  image
		//		============================================================================================================================================================

		String expectedLastName = excel.stringCellValue(EXCEL_PATH,"Contacts",5,0);
		createnewcontactpage.getLastname().clear();
		createnewcontactpage.getLastname().sendKeys(expectedLastName);
		String actualLastName = createnewcontactpage.getLastname().getAttribute("value");
		Assert.assertEquals(actualLastName, expectedLastName,"Expected last Name should not be display");
		Reporter.log("Expected Last Name Should be Display",true);
		createnewcontactpage.getExportContact().click();
		String expectedExportContactTitle = "Contacts >> Export";
		String actualExportContactTitle = createnewcontactpage.getContactExport().getText();
		Assert.assertEquals(actualExportContactTitle,expectedExportContactTitle, "Export Contact Page should not be display");
		Reporter.log("Export Contact Page should be display",true);

		//	    Click On Export Contact
		//		============================================================================================================================================================

		ExportContactPage exportContact = new ExportContactPage(driver);
		exportContact.getExportDataInCurrentPage().click();
		exportContact.getExport().click();
		Thread.sleep(3000);
	}
}
