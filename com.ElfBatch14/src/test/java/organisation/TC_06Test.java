package organisation;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;

import pomRepository.HomePage;
import pomRepository.OrganizationPage;

public class TC_06Test extends BaseTest{
	@Test
	public void CreateOrganizationWithMembersOf() throws Exception
	{

		//navigate to organization-
		//------------------------------------------------------------------------------//


		OrganizationPage orgname=new OrganizationPage(driver);
		orgname.getorganizationLink().click();
		String tt = driver.getTitle();
		System.out.println(tt);
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		Reporter.log("Organization page is displayed",true);

		//navigate to "create new organization"page by click on "+" image
		//---------------------------------------------------------------------//

		OrganizationPage organize=new OrganizationPage(driver);
		organize.getcreateOrganizationImage().click();
		String ty = driver.getTitle();
		System.out.println(ty);

		Assert.assertEquals(driver.getTitle(),"Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		Reporter.log("Create new Organization page is displayed",true);

		//create Organization Name
		organize.getOrganizationName().sendKeys("hacke2r");

		//navigate to "member of " by click on "+" image

		organize.getselectOrganization().click();
		String th = driver.getTitle();
		System.out.println(th);
		Assert.assertEquals(driver.getTitle(),"Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		Reporter.log(" Organization Name list page is displayed",true);


		String parentB1 = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for(String wh:child)
		{
			//Navigate to child window
			driver.switchTo().window(wh);

		}
		//Select the Required Organization

		organize.getselect2OrgName().click();
		Reporter.log("selected the Required Organization",true);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		String parentA = driver.getWindowHandle();

		//Navigate to Parent window

		driver.switchTo().window(parentB1);

		//save the Organization

		organize.getsaveButton().click();
		String tk = driver.getTitle();
		System.out.println(tk);
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		Reporter.log("Saved the Organization ",true);








	}

}
