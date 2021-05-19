package contacts;

import java.util.Set;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;

/*
 *  @Author Rekha V
 */
public class Tc_7Test extends BaseTest{

	@Test(groups="smoke")
	public void createContactWhileErasingReportsWhileSelectingOnClearImage() throws Exception{		

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

		//		Enter mandatory values & click on "Report" Look-UP image
		//		============================================================================================================================================================

		String expectedLastName = excel.stringCellValue(EXCEL_PATH,"Contacts",6,0);
		createnewcontactpage.getLastname().clear();
		createnewcontactpage.getLastname().sendKeys(expectedLastName);
		String actualResult = createnewcontactpage.getLastname().getAttribute("value");
		Assert.assertEquals(actualResult, expectedLastName,"Expected last Name should not be display");
		Reporter.log("Expected Last Name Should be Display",true);
		createnewcontactpage.getAssigntyperadiobutton().click();
		WebElement groupdropdown = createnewcontactpage.getDropdown();
		select.SelectElement(groupdropdown,"Marketing Group");
		Reporter.log("Expected Drop Down is Selected",true);
		createnewcontactpage.getReportButton().click();
		String ExpectedContactsTitle = "Contacts";
		String actualContactsTitle = createnewcontactpage.getSearchBasicMode().getText();
		Assert.assertEquals(actualContactsTitle, ExpectedContactsTitle,"Contact Page should Not display in another browser-Window");
		Reporter.log("Contact Page should be display in another browser-Window",true);

		//		select the Existing contact from the contact list Page
		//		============================================================================================================================================================

		String parentId = driver.getWindowHandle();
		Set<String> allWids = driver.getWindowHandles();
		allWids.remove(parentId);
		for(String s:allWids) {
			driver.switchTo().window(s);
			Reporter.log("Switching the Control to New Window",true);
			createnewcontactpage.getSelectContact().click();
			Reporter.log("Contact Should be Selected and Clicked",true);
		}

		//		place the mouse cursor and click on clear image
		//		============================================================================================================================================================

		driver.switchTo().window(parentId);
		Reporter.log("Switching the Control Back to Parent Window",true);
		createnewcontactpage.getReportClearButton().click();
		Reporter.log("Contact Name should be cleared Successfully",true );

		//		click on save Button
		//		============================================================================================================================================================

		createnewcontactpage.getButton().click();
		Reporter.log("Contact should be saved successfully",true);
	}
}
