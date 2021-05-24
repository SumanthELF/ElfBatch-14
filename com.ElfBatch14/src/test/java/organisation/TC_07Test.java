package organisation;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;

import pomRepository.OrganizationPage;

public class TC_07Test  extends BaseTest{
	@Test

	public void CreateOrganizationWithMembersOfAndClear() throws Exception
	{


		OrganizationPage orgpage=new OrganizationPage(driver);

		//navigate to organization

		orgpage.getorganizationLink().click();
		//String t12 = driver.getTitle();
		//System.out.println(t12);
		Assert.assertEquals(driver.getTitle(),"Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM" );

		Reporter.log("Organiztion page is displayed",true);
		OrganizationPage create=new OrganizationPage(driver);

		//navigate to "create new organization"page by click on "+" image


		create.getcreateOrganizationImage().click();
		//Assert.fail();
		//String t11 = driver.getTitle();
		//System.out.println(t11);
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		Reporter.log("New Create Organization page is displayed",true);
		//Enter the Organization Name
		create.getOrganizationName().sendKeys("abb879b");

		//navigate to "member of " by click on "+" image
		create.getselectOrganization().click();
		//String t7 = driver.getTitle();
		//System.out.println(t7);
		Assert.assertEquals(driver.getTitle(), "Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		Reporter.log(" Organization Name list page is displayed",true);

		String parentB = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for(String wh:child)
		{
			//Navigate to child window
			driver.switchTo().window(wh);

		}
		//Select the Required Organization
		create.getselectorgName().click();
		Reporter.log("selected the Required Organization",true);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		String parentA = driver.getWindowHandle();
		////Navigate to Parent window
		driver.switchTo().window(parentB);


		//clear the selected Organization 
		create.getclearButton().click();
		Reporter.log("cleared the organization",true);
		////save the Organization
		create.getsaveButton().click();
		//String t8 = driver.getTitle();
		//System.out.println(t8);
		Assert.assertEquals(driver.getTitle(),"Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		Reporter.log("saved the organization name",true);





	}		

}
