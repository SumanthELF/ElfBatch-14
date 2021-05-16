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
public class TC_13Test extends BaseTest {
	@Test(groups="adhok",retryAnalyzer = IRetryAnalyzer.class)
	public void goToExistingProductPageAndDelete() {
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

		//step6: Deleting the element
		//=================================================================================================

		ProductsPage  products= new ProductsPage(driver);

		products.getProduct2Duplicates().click();
		Assert.assertEquals("Vtiger 5 Users Pack", products.getDeletingproduct().getText(),"product2 infrmation page is 'NOT' displayed");		
		Reporter.log("product2 information page is displayed",true);

		products.getDelete().click();
		driver.switchTo().alert().accept();
		Reporter.log("product is deleted",true);

	}

}
