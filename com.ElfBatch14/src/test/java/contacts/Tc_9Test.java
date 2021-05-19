package contacts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;

/*
 *  @Author Rekha V
 */
public class Tc_9Test extends BaseTest {

	@Test(groups="smoke")
	public void createContactWhileAssiginingToAdminstratorAsUser() throws Exception{

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

		//		Create a contact with mandatory fields and select "administrator" as a "user" form dropdown and save
		//		============================================================================================================================================================

		String expectedLastName = excel.stringCellValue(EXCEL_PATH,"Contacts",8,0);
		createnewcontactpage.getLastname().clear();
		createnewcontactpage.getLastname().sendKeys(expectedLastName);
		String actualResult = createnewcontactpage.getLastname().getAttribute("value");
		Assert.assertEquals(actualResult, expectedLastName,"Expected last Name should not be display");
		Reporter.log("Expected Last Name Should be Display",true);
		createnewcontactpage.getUserRadioButton().click();
		WebElement groupDropDown = createnewcontactpage.getUserDropDown();
		select.SelectElement(groupDropDown," Administrator");
		Reporter.log("Expected Drop Down is Selected",true);
		createnewcontactpage.getButton().click();
		Reporter.log("Contact should be Saved Successfully",true);
	}
}
