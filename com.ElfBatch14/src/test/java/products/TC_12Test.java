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
public class TC_12Test extends BaseTest {

	@Test(groups="smoke",retryAnalyzer = IRetryAnalyzer.class)
	public void goToExistingProductPageAndDuplicate() {

		//step3: HomePage Verification
		//=========================================================================================

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

		//step6: Duplicate the element
		//=================================================================================================

		ProductsPage  products= new ProductsPage(driver);

		products.getProduct2().click();
		Assert.assertEquals("[ PRO2 ] Vtiger 5 Users Pack - Product Information", products.getProductHeaderText().getText(),"product2 infrmation page is 'NOT' displayed");		
		Reporter.log("product2 information page is displayed",true);

		products.getDuplicate().click();
		Assert.assertEquals("Duplicating \"Vtiger 5 Users Pack\"", products.getProductHeaderText().getText(),"product2  duplicating page is 'NOT' displayed");		
		Reporter.log("product2 duplicating page is displayed",true);

		products.getSave().click();
		homepage.getProducts().click();
		Assert.assertEquals(products.getProduct2().getText(), products.getProduct2Duplicates().getText(),"product2 is 'NOT' duplicated");		
		Reporter.log("product is duplicated",true);
	}

}
