package contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import genericLibrary.BaseTest;

public class TC_13Test  extends BaseTest {

	@Test(groups="casetwo")

	public void createContact13() throws EncryptedDocumentException, IOException, InterruptedException {

		//============================================================================================================================
		//Step 3: Place the mouse cursor and click on "Contact" link

		homepage.getContacts().click();
		Assert.assertEquals(driver.getTitle(),"Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM","Contact list page is not displayed");
		Reporter.log("Contact list page is displayed",true);

		//==============================================================================================================================
		//Step 4: Select multiple contacts and go for mass delete

		contactpage.getContactone().click();
		Reporter.log("first contact is selected",true);
		contactpage.getContacttwo().click();
		Reporter.log("second contact is selected",true);
		contactpage.getContactthree().click();
		Reporter.log("third contact is selected",true);
		contactpage.getContactfour().click();
		Reporter.log("fourth contact is selected",true);
		//		contactpage.getDeletebutton().click();
		//		driver.switchTo().alert().accept();
		//		Assert.assertEquals(contactpage.getContactone().isDisplayed(),true,"contacts are not deleted successfully");
		//		Reporter.log("contacts are deleted successfully",true);


	}

}
