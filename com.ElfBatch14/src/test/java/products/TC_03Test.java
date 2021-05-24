package products;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;


public class TC_03Test extends BaseTest {
	@Test
	public void CreateProductWithActive() throws Exception {
		Assert.assertEquals("Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM",driver.getTitle(),"Home page is not displayed");
		Reporter.log("Home page is displayed",true);

		//Place the mouse cursor on "Product" and click on Product link
		WebElement element =homepage.getProducts();
    	Actions actions = new Actions(driver);
    	actions.moveToElement(element).perform();
    	homepage.getProducts().click();
		Assert.assertEquals("Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM",driver.getTitle(),"Product list page is not displayed");
		Reporter.log("Product list page is displayed",true);

		//naviagate to "create new Product"page by click on "+" image
		productList.getNewProduct().click();
		Assert.assertEquals("Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM",driver.getTitle(),"new Product page is not displayed");
		Reporter.log("new Product page is displayed",true);

		//create a Product and save
		createProduct.getProductName().sendKeys(excel.stringCellValue(EXCEL_PATH,"products",0,1));
		createProduct.getSaveButton().click();
		Assert.assertEquals("Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM",driver.getTitle(),"Product is not added");
		Reporter.log("Product is added successfully",true);
		 WebElement active = driver.findElement(By.id("dtlview_Product Active"));;
		Assert.assertEquals("yes ",active.getText(),"Product is inactive");
		Reporter.log("Product is active",true);

		
		//Logout
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement a = driver.findElement(By.xpath("//a[text()='Sign Out']"));
		js.executeScript("arguments[0].click();",a);
		Assert.assertEquals("vtiger CRM 5 - Commercial Open Source CRM",driver.getTitle(),"Login page is not displayed");
		Reporter.log("login page is displayed",true);

	}
}
