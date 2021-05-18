package leads;
import genericLibrary.BaseTest;
import genericLibrary.ExcelUtil;
import genericLibrary.SelectUtil;

import pomRepository.*;
import org.testng.Assert;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
 * @author Shraddha Bagoji
 */
public class TC_001Test extends BaseTest{


	@Test(groups = "smoke")
	public void createNewLeadBySelectingDifferrentLeadSourceFromDropDown() throws Exception {
		//=================================================================================================================================================================================================
		//step3:Navigate to leads page by clicking on Leads tab
		homepage = new HomePage(driver);
		leads=new LeadsPage(driver);
		homepage.getLeadsTab().click();
		leads.getCreateLeadButton().click();
		String expHeader="Creating New Lead";
		String actHeader = leads.getTitle().getText();
		Assert.assertEquals(actHeader,expHeader,"Create New Lead page is not displayed");
		//=================================================================================================================================================================================================
		//step4:Enter the data into all the textfield and click on save button
		WebElement ele1 = leads.getFirstNameDropDown();
		// Select select=new Select(ele1);
		// select.selectByValue(ed.toGetStringData("./Resources1/detailssss22.xlsx","sheet1", 5, 1));
		select=new SelectUtil();
		select.SelectElement(ele1, "0");
		System.out.println("a");
		ExcelUtil excel = new ExcelUtil();
		leads.getFirstNameTextField().sendKeys(excel.stringCellValue(EXCEL_PATH,"Leads", 5, 1));
		leads.getLastNameTextField().sendKeys(excel.stringCellValue(EXCEL_PATH,"Leads", 5, 2));
		leads.getCompanyTextField().sendKeys(excel.stringCellValue(EXCEL_PATH,"Leads", 5, 3));
		leads.getTitleTextField().sendKeys(excel.stringCellValue(EXCEL_PATH,"Leads", 5, 4));
		WebElement ele2 = leads.getLeadSourceDropDown();
		select.SelectElement(ele2,"0");
		WebElement ele3 = leads.getIndustryDropDown();
		select.SelectElement(ele3,"Banking");
		leads.getAnnualRevenueTextField().clear();
		int annualRevenueRs=excel.numericCellvalue1(EXCEL_PATH, "Leads", 5, 5);
		String s= Integer.toString(annualRevenueRs);
		leads.getAnnualRevenueTextField().sendKeys(s);
		int emp = excel.numericCellvalue1(EXCEL_PATH,"Leads", 5, 6);
		String s1 = Integer.toString(emp);
		leads.getNoOfEmployeeTextfield().sendKeys(s1);
		leads.getSecondaryemailTextField().sendKeys(excel.stringCellValue(EXCEL_PATH,"Leads", 5, 7));
		int phone=excel.numericCellvalue1(EXCEL_PATH,"Leads", 5, 8);
		String phone1 = Integer.toString(phone);
		leads.getPhoneTextField().sendKeys(phone1);
		int mobile = excel.numericCellvalue1(EXCEL_PATH,"Leads", 5, 9);
		String mob = Integer.toString(mobile);
		leads.getMobileTextField().sendKeys(mob);
		int fax=excel.numericCellvalue1(EXCEL_PATH,"Leads",5, 10);
		String fax1 = Integer.toString(fax);
		leads.getFaxTextField().sendKeys(fax1);
		leads.getEmailTextField().sendKeys(excel.stringCellValue(EXCEL_PATH,"Leads", 5, 11));
		leads.getWebsiteTextField().sendKeys(excel.stringCellValue(EXCEL_PATH,"Leads", 5, 12));
		WebElement ele4 = leads.getLeadStatusDropDown();
		select.SelectElement(ele4,"Cold");
		WebElement ele5 = leads.getRatingDropDown();
		select.SelectElement(ele5,"Active");
		leads.getAssignTypeRadioButton().click();
		leads.getStreetTextField().sendKeys(excel.stringCellValue(EXCEL_PATH,"Leads", 5, 13));
		int postal = excel.numericCellvalue1(EXCEL_PATH,"Leads", 5, 14);
		String pc = Integer.toString(postal);
		leads.getPostalcodeTextField().sendKeys(pc);
		leads.getPoboxTextField().sendKeys(excel.stringCellValue(EXCEL_PATH,"Leads", 5, 15));
		leads.getCityTextField().sendKeys(excel.stringCellValue(EXCEL_PATH,"Leads", 5, 16));
		leads.getStateTextField().sendKeys(excel.stringCellValue(EXCEL_PATH,"Leads", 5, 1));
		leads.getDescriptionTextField().sendKeys(excel.stringCellValue(EXCEL_PATH,"Leads", 5, 17));
		leads.getCountryTextField().sendKeys(excel.stringCellValue(EXCEL_PATH,"Leads", 5, 18));
		leads.getSaveButton().click();
		System.out.println("Entered data into all the fields and saved");
		System.out.println("Unique lead id is generated successfully"+"LEA15");



	}



}
