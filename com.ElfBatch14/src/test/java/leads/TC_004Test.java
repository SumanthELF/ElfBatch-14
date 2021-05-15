package leads;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import genericLibrary.BaseTest;
import genericLibrary.ExcelUtil;
import genericLibrary.SelectUtil;
import pomRepository.HomePage;
import pomRepository.LeadsPage;

/*
 * Author SHRADDHABAGOJI
 * 
 */
public class TC_004Test extends BaseTest {
	@Test(groups="functional")
	public void deleteALeadFromLeads() throws Exception {
		homepage=new HomePage(driver);
		//Navigated to leads Tab
		//====================================================================================
		homepage.getLeadsTab().click();
		ExcelUtil excel=new ExcelUtil();
		LeadsPage leads=new LeadsPage(driver);
		leads.getSearchForTextfield().sendKeys(excel.stringCellValue(EXCEL_PATH,"Leads", 6, 0));
		WebElement element = leads.getInDropDown();
		select=new SelectUtil();
		select.SelectElement(element,"firstname");
		leads.getSearchButton().click();
		leads.getCheckBox().click();
		leads.getDelButton().click();
		driver.switchTo().alert().accept();
	}

}


