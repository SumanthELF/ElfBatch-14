package contacts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.ContactPage;
import pomRepository.CreateNewContactPage;

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

		ContactPage contactPage=new ContactPage(driver);
		contactPage.getPlusImage().click();
		String expectedtitle = "Creating New Contact";
		String actualTitle = contactPage.getContactInformation().getText();
		Assert.assertEquals(actualTitle, expectedtitle, "Creating New Contact should not be display");
		Reporter.log("Creating New Contact should be display",true);

		//		Create a contact with mandatory fields and select "administrator" as a "user" form dropdown and save
		//		============================================================================================================================================================

		CreateNewContactPage createNewContact = new CreateNewContactPage(driver);
		String expectedLastName = excel.stringCellValue(EXCEL_PATH,"Contacts",8,0);
		createNewContact.getLastname().clear();
		createNewContact.getLastname().sendKeys(expectedLastName);
		String actualResult = createNewContact.getLastname().getAttribute("value");
		Assert.assertEquals(actualResult, expectedLastName,"Expected last Name should not be display");
		Reporter.log("Expected Last Name Should be Display",true);
		createNewContact.getUserRadioButton().click();
		WebElement groupDropDown = createNewContact.getUserDropDown();
		select.SelectElement(groupDropDown," Administrator");
		Reporter.log("Expected Drop Down is Selected",true);
		createNewContact.getButton().click();
		Reporter.log("Contact should be Saved Successfully",true);
	}
}
