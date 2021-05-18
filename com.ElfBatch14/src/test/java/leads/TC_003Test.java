package leads;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.HomePage;
import pomRepository.LeadsPage;

import org.testng.Assert;

/*
 * @author Shraddha Bagoji
 */
public class TC_003Test extends BaseTest {

	@Test(groups="smoke")
	public void blankFieldsAndSave() {
		homepage=new HomePage(driver);
		//step3:Navigate to Leads page
		//=============================================================================================================================
		homepage.getLeadsTab().click();
		Reporter.log("Navigated to leads page successfully",true);

		//step4:Click on CreateNewlead Button
		//==============================================================================================================================
		leads=new LeadsPage(driver);
		leads.getCreateLeadButton().click();
		String expHeader="Creating New Lead";
		String actHeader = leads.getTitle().getText();
		Assert.assertEquals(actHeader,expHeader,"CreatingNewLeadPage is displayed");
		//step5:Click on Save Button
		//==============================================================================================================================
		leads.getSaveButton().click();
		driver.switchTo().alert().accept();

	}



}


