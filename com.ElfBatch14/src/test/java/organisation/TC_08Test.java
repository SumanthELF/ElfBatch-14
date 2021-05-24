package organisation;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;

import pomRepository.OrganizationPage;
import pomRepository.SelectOrganizationPage;

public class TC_08Test extends BaseTest{
	@Test
	public void CheckWhileCreatingNewOrganizationEmailOptOutSelectOptionIsEnabledOrNot() throws Exception
	{

		   OrganizationPage	orgpage =new OrganizationPage(driver);

		//navigate to organization
		   orgpage.getorganizationLink().click();

		Assert.assertEquals(driver.getTitle(),"Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM", "organization page is Not Displayed");
		Reporter.log("Organiztion page is displayed",true);
		OrganizationPage create=new OrganizationPage(driver);

		//navigate to "create new organization"page by click on "+" image
		create.getcreateOrganizationImage().click();
		String t4= driver.getTitle();
		System.out.println(t4);
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		Reporter.log("New Create Organization page is displayed",true);

		//Enter the New Organization Name
		create.getOrganizationName().sendKeys("abb34");
		String t5 = driver.getTitle();
		System.out.println(t5);
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		Reporter.log("Entered Organization Name ",true);

		SelectOrganizationPage select=new SelectOrganizationPage(driver);

		//navigate to "Email Opt Out " by clicking on "select box"
		select.getemailopcheckbox().click();
		String t6 = driver.getTitle();
		System.out.println(t6);
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		Reporter.log("checked the email checkbox",true);

		//Save the Organization
		create.getsaveButton().click();
		String t7 = driver.getTitle();
		System.out.println(t7);
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		Reporter.log("saved the organization name",true);



	}
}



