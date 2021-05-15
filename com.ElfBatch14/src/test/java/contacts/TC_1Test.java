package contacts;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;


public class TC_1Test extends BaseTest{

	@Test(groups="one")

	public void creatContact() {

		//=====================================================================================================================
		//Step3 : Place the mouse cursor and click on "contact" link

		homepage.getContacts().click();
		Assert.assertEquals(driver.getTitle(),"Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM","Contact list page is not displayed");
		Reporter.log("Contact list page is displayed",true);

		//=====================================================================================================================
		//Step4 : navigate to "create new contact" page by click on "+" image

		contactpage.getPlusImage().click();
		Assert.assertEquals(driver.getTitle(),"Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM","create new contact page is not displayed");
		Reporter.log("create new contact page is displayed",true);

		//=======================================================================================================================
		//Step5 : Create new contact without mandatory fields and save

		createnewcontactpage.getButton().click();
		Alert alert=driver.switchTo().alert();
		Assert.assertEquals(alert.getText(),"Last Name cannot be empty","Alert Popup is not displayed with proper Error message");
		Reporter.log("Alert Popup is displayed with proper Error message",true);
		alert.accept();

	}

}
