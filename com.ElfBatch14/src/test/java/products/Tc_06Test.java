package products;



import java.awt.Robot;


import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.HomePage;
import pomRepository.ProductsPage;



public class Tc_06Test extends BaseTest{
	@Test
	public void GoToProductCreatingPageAndNevigateToVendorImage() throws Exception{

		//navigate to application
		//=======================================================================================
		Reporter.log(driver.getTitle());


		//Place the mouse cursor on "Product" and click on Product link
		//=======================================================================================
		HomePage homepage = new HomePage(driver);
		homepage.getProducts().click();

		//naviagate to "create new Product"page by click on "+" image
		//=======================================================================================
		ProductsPage productpage = new ProductsPage(driver);
		productpage.getcreateproduct().click();
		
		Assert.assertEquals(driver.getTitle(),"Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM","Product page is 'Not' displayed");
		Reporter.log(" 'Product' List page is display",true);
		
		//Enter mandatory values & click on "Vendor Name" Look-UP image
		//=======================================================================================
		genericLibrary.ExcelUtil excel = new genericLibrary.ExcelUtil();   		
		String productname = excel.stringCellValue(EXCEL_PATH,"Sheet1",5,0);
		String productcode = excel.stringCellValue(EXCEL_PATH,"Sheet1",5,1);
		String commissionrate =excel.stringCellValue(EXCEL_PATH,"Sheet1",5,2);
		String unit_price = excel.stringCellValue(EXCEL_PATH,"Sheet1",5,3);
		String qty_per_unit = excel.stringCellValue(EXCEL_PATH,"Sheet1",5,4);
		String qtyinstock = excel.stringCellValue(EXCEL_PATH,"Sheet1",5,5);
		String description = excel.stringCellValue(EXCEL_PATH,"Sheet1",5,6);
		productpage.getproductname().sendKeys(productname);
		productpage.getproductcode().sendKeys(productcode);
		productpage.getcommissionrate().sendKeys(commissionrate);
		productpage.getunit_price().sendKeys(unit_price);
		productpage.getqty_per_unit().sendKeys(qty_per_unit);
		productpage.getqtyinstock().sendKeys(qtyinstock); 
		productpage.getdescription().sendKeys(description);
		Assert.assertEquals(driver.getTitle(), "Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM");

		Reporter.log("'Creating New Product' page is display",true);

		productpage.getSelectvendor().click();
		Reporter.log(" 'Vendor Name' Page is  displayed in anaother browser-Window",true);
		String parentB = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for(String win:child)
		{
			driver.switchTo().window(win);
		}
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		@SuppressWarnings("unused")
		String parentA=driver.getWindowHandle();
		driver.switchTo().window(parentB);
		driver.findElement(By.xpath("//input[@name='button']")).click();
		System.out.println(" 'Pendrive'  Product Information   Updated Today ");
	}
}


