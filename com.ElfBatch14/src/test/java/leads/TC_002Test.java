package leads;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.HomePage;
import pomRepository.LeadsPage;
/*
 * @author Shraddha Bagoji
 */
public class TC_002Test extends BaseTest {
	@Test(groups="functional")
	public void blankFieldsAndCancel() {
		//step3:home page is dispalyed
		String expHome="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String actTitleHome = driver.getTitle();
		System.out.println(actTitleHome);
		Assert.assertEquals("HomePage is not displayed", expHome, actTitleHome);
		//=================================================================================================================================================================================================
		//step4:Navigate to leads page by clicking on Leads tab
		homepage=new HomePage(driver);
		leads=new LeadsPage(driver);
		homepage.getLeadsTab().click();
		leads.getCreateLeadButton().click();
		String expHeader="Creating New Lead";
		String actHeader = leads.getTitle().getText();
		Assert.assertEquals("CreatingNewLead page is not displayed", expHeader, actHeader);
		//=================================================================================================================================================
		//step5:Without entering data into any field and click on cancel button
		leads.getCancelButton().click();
		System.out.println("clicked on cancel button successfully");


	}

}
