package products;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.HomePage;
import pomRepository.ProductsPage;

@Listeners(genericLibrary.ListenerImplementation.class)
public class TC_11Test extends BaseTest{
	@Test(groups="smoke", retryAnalyzer =IRetryAnalyzer.class )
	public void goToExistingProductPageAndEdit() throws Exception {

		//step3: verification of home page
		//============================================================================================

		Assert.assertEquals("Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM", driver.getTitle(),"homepage is 'NOT' displayed");
		Reporter.log("homepage is dispalyed",true);

		//step4: navigate to products page
		//==============================================================================================
		HomePage homepage=new HomePage(driver);
		homepage.getProducts().click();

		//step5:verification of product page
		//===============================================================================================

		Assert.assertEquals("Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM", driver.getTitle(),"productsepage is 'NOT' displayed");
		Reporter.log("productspage is displayed",true);

		//step6: Editing the element
		//=================================================================================================

		ProductsPage  products= new ProductsPage(driver);

		products.getProduct2().click();
		Assert.assertEquals("[ PRO2 ] Vtiger 5 Users Pack - Product Information", products.getProductHeaderText().getText(),"product2 page is 'NOT' displayed");		
		Reporter.log("product2 is displayed",true);

		products.getEdit().click();
		Assert.assertEquals("[ PRO2 ] Vtiger 5 Users Pack - Editing Product Information", products.getProductHeaderText().getText(),"product2 editing page is 'NOT' displayed");		
		Reporter.log("editing page is displayed",true);

		products.getSave().click();
	}

}
