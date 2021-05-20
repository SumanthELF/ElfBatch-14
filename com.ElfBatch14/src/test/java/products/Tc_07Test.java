package products;

import org.testng.Assert;
import org.testng.Reporter;

import org.testng.annotations.Test;

import POMRepository.HomePage;
import POMRepository.ProductPage;
import genericLibraries.BaseTest;

public class Tc_07Test extends BaseTest{
	@Test
	public void GoToProductCreatingPageAndNevigateToPricingInformation () throws Exception{

		//navigate to application
		//=======================================================================================
		Reporter.log(driver.getTitle());

		//Place the mouse cursor on "Product" and click on Product link
		//=======================================================================================
		HomePage homepage = new HomePage(driver);
		homepage.getproducts().click();

		//naviagate to "create new Product"page by click on "+" image
		//=======================================================================================
		ProductPage productpage = new ProductPage(driver);
		productpage.getcreateproduct().click();

		Assert.assertEquals(driver.getTitle(),"Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM","Product page is 'Not' displayed");
		Reporter.log(" 'Product' List page is display",true);


		//naviagate to "create new Product"page by click on "+" image
		//=======================================================================================
		genericLibraries.ExcelLibUtil excel = new genericLibraries.ExcelLibUtil();   		
		String productname = excel.getStringCellValue(EXCEL_PATH,"Sheet1",6,0);
		String productcode = excel.getStringCellValue(EXCEL_PATH,"Sheet1",6,1);
		String commissionrate =excel.getStringCellValue(EXCEL_PATH,"Sheet1",6,2);
		String unit_price = excel.getStringCellValue(EXCEL_PATH,"Sheet1",6,3);
		String qty_per_unit = excel.getStringCellValue(EXCEL_PATH,"Sheet1",6,4);
		String qtyinstock = excel.getStringCellValue(EXCEL_PATH,"Sheet1",6,5);
		String description = excel.getStringCellValue(EXCEL_PATH,"Sheet1",6,6);
		productpage.getproductname().sendKeys(productname);
		productpage.getproductcode().sendKeys(productcode);
		productpage.getcommissionrate().sendKeys(commissionrate);
		productpage.getunit_price().sendKeys(unit_price);
		productpage.getqty_per_unit().sendKeys(qty_per_unit);
		productpage.getqtyinstock().sendKeys(qtyinstock); 
		productpage.getdescription().sendKeys(description);

		Reporter.log("'Creating New Product' page is display",true);
		Thread.sleep(2000);


		//Take the crossor on "More currencies"link
		//=======================================================================================

		productpage.getmore().click();
		Thread.sleep(3000);
		Reporter.log("The  'product price page' is display",true);	 


	}
}


