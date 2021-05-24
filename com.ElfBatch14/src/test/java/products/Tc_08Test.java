package products;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.HomePage;
import pomRepository.ProductsPage;

public class Tc_08Test extends BaseTest{
	@Test
	public void GoToProductCreatingPageAndNevigateToStockInformation () throws Exception{

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

		genericLibrary.ExcelUtil excel = new genericLibrary.ExcelUtil();   		
		String productname = excel.stringCellValue(EXCEL_PATH,"Sheet1",7,0);
		String productcode = excel.stringCellValue(EXCEL_PATH,"Sheet1",7,1);
		String commissionrate =excel.stringCellValue(EXCEL_PATH,"Sheet1",7,2);
		String unit_price = excel.stringCellValue(EXCEL_PATH,"Sheet1",7,3);
		String qty_per_unit = excel.stringCellValue(EXCEL_PATH,"Sheet1",7,4);
		String qtyinstock = excel.stringCellValue(EXCEL_PATH,"Sheet1",7,5);
		String description = excel.stringCellValue(EXCEL_PATH,"Sheet1",7,6);
		productpage.getproductname().sendKeys(productname);
		productpage.getproductcode().sendKeys(productcode);
		productpage.getcommissionrate().sendKeys(commissionrate);
		productpage.getunit_price().sendKeys(unit_price);
		productpage.getqty_per_unit().sendKeys(qty_per_unit);
		productpage.getqtyinstock().sendKeys(qtyinstock); 
		productpage.getdescription().sendKeys(description);
		Reporter.log("'Creating New Product' page is display",true);


		//Take the cursor on "Usage unit"drop down
		//=======================================================================================
		productpage.getusageunit().click();
		WebElement element = driver.findElement(By.name("usageunit"));
		Thread.sleep(2000);
		Select select = new Select(element);
		select.selectByVisibleText("Pieces");
		Thread.sleep(2000);
		Reporter.log("The  'product Usage unit' types  is dispalyed ",true);	 


	}
}


