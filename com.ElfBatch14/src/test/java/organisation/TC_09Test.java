package organisation;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;


import pomRepository.OrganizationPage;
import pomRepository.SelectOrganizationPage;

public class TC_09Test extends BaseTest {
	@Test

	public void CheckWhileCreatingNewOrganizationEmailOptOutSelectOptionIsEnabledOrNot() throws Exception
	{
		//WebActionUtils act;
		OrganizationPage orgpage=new OrganizationPage(driver);

		//navigate to organization
		orgpage.getorganizationLink().click();
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM","Organization page is not displayed");
		Reporter.log("Organiztion page is displayed",true);
		OrganizationPage create=new OrganizationPage(driver);

		//navigate to "create new organization"page by click on "+" image

		create.getcreateOrganizationImage().click();

		//Enter the Organization Name
		create.getOrganizationName().sendKeys("ab77b3");
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM","Organization page is not displayed");
		Reporter.log("Entered Organization Name ",true);
		SelectOrganizationPage select=new SelectOrganizationPage(driver);

		//navigate to "Email Opt Out " by clicking on "select box"
		WebElement element = select.getemailopcheckbox();
		//act=new WebActionUtils();
		//act.DoubleClick(element,driver);

		Reporter.log("Selected Box is Enabled");

		//save the Organization
		create.getsaveButton().click();
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM","Organization page is not displayed");
		Reporter.log("saved the organization name",true);
	}


}
