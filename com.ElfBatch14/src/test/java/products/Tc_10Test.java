package products;

import org.testng.Assert;
import org.testng.Reporter;


import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.HomePage;
import pomRepository.ProductsPage;

public class Tc_10Test extends BaseTest{
	@Test
	public void GoToProductCreatingPageFillAllTheFieldsAndCancel() throws Exception{


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

		//Take the crossor on "Usage unit"drop down
		//=======================================================================================
		genericLibrary.ExcelUtil excel = new genericLibrary.ExcelUtil();   		
		String productname = excel.stringCellValue(EXCEL_PATH,"Sheet1",9,0);
		String productcode = excel.stringCellValue(EXCEL_PATH,"Sheet1",9,1);
		String commissionrate =excel.stringCellValue(EXCEL_PATH,"Sheet1",9,2);
		String unit_price = excel.stringCellValue(EXCEL_PATH,"Sheet1",9,3);
		String qty_per_unit = excel.stringCellValue(EXCEL_PATH,"Sheet1",9,4);
		String qtyinstock = excel.stringCellValue(EXCEL_PATH,"Sheet1",9,5);
		String description = excel.stringCellValue(EXCEL_PATH,"Sheet1",9,6);
		productpage.getproductname().sendKeys(productname);
		productpage.getproductcode().sendKeys(productcode);
		productpage.getcommissionrate().sendKeys(commissionrate);
		productpage.getunit_price().sendKeys(unit_price);
		productpage.getqty_per_unit().sendKeys(qty_per_unit);
		productpage.getqtyinstock().sendKeys(qtyinstock); 
		productpage.getdescription().sendKeys(description);


		Reporter.log("'Creating New Product' page is display",true);


		Thread.sleep(2000);
		productpage.getproductname().clear();
		productpage.getproductcode().clear();
		productpage.getcommissionrate().clear();
		productpage.getunit_price().clear();
		productpage.getqty_per_unit().clear();
		productpage.getqtyinstock().clear();
		productpage.getdescription().clear();
		Thread.sleep(2000);

		Reporter.log("All the fields are cleared",true);

	}
}


