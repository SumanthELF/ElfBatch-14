package leads;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.ExcelUtil;
import genericLibrary.SelectUtil;
import pomRepository.LeadsPage;

/*
 * @author Shraddha Bagoji
 */
public class TC_005Test extends BaseTest {
	
	@Test(groups="functional")
	public void createNewLeadByEnteringMandatoryFields() throws Exception{
		homepage.getLeadsTab().click();
		Reporter.log("Navigated to Leads Tab",true);
		leads=new LeadsPage(driver);
		leads.getCreateLeadButton().click();
		WebElement ele = leads.getFirstNameDropDown();
		select=new SelectUtil();
		select.SelectElement(ele,"2");
		ExcelUtil excel=new ExcelUtil();
		leads.getFirstNameTextField().sendKeys(excel.stringCellValue(EXCEL_PATH,"sheet1", 2, 0));
		leads.getLastNameTextField().sendKeys(excel.stringCellValue(EXCEL_PATH,"sheet1", 2, 1));
		leads.getCompanyTextField().sendKeys(excel.stringCellValue(EXCEL_PATH,"sheet1", 2, 2));
		leads.getAssignTypeRadioButton().click();
		leads.getSaveButton().click();
		driver.navigate().to("http://localhost:8888/index.php?action=index&module=Home");
		homepage.getLeadsTab().click();
		leads.getDelButton().click();
		driver.switchTo().alert().accept();	
	}
}
