package organisation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.OrganizationPage;
import pomRepository.SelectOrganizationPage;

public class TC_10Test  extends BaseTest{
	@Test
	public void CreateOrganizationWithAssignedToUserAsAministratot() throws Exception
	{
		OrganizationPage orgname=new OrganizationPage(driver);


		//navigate to organization
		orgname.getorganizationLink().click();
		String t1= driver.getTitle();
		System.out.println(t1);
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");

		Reporter.log("Organiztion page is displayed",true);
		OrganizationPage create=new OrganizationPage(driver);

		//navigate to "create new organization"page by click on "+" image
		create.getcreateOrganizationImage().click();
		String t2= driver.getTitle();
		System.out.println(t2);
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");


		Reporter.log("New Create Organization page is displayed",true);
		//Enter the New Organization Name
		create.getOrganizationName().sendKeys("a567");
		String t3= driver.getTitle();
		System.out.println(t3);
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		Reporter.log("Entered Organization Name ",true);
		SelectOrganizationPage select=new SelectOrganizationPage(driver);

		//navigate to "Assigned To " by clicking on "User" as "Administrator"
		WebElement element2 = select.getassignedUserdrop();
		Select s=new Select(element2);
		//select the Administrator

		s.selectByIndex(0);
		Reporter.log("selected the adminstrator",true);
		//Save the Organization Name
		create.getsaveButton().click();
		String t5 = driver.getTitle();
		System.out.println(t5);
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM", "organization page is displayed");
		//Assert.assertEquals(driver.getTitle()," Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM", "home page is Not Displayed");
		Reporter.log("saved the organization name",true);
	}

}
