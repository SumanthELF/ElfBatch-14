package products;

import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.HomePage;
import pomRepository.ProductsPage;

@SuppressWarnings("unused")
public class Tc_09Test extends BaseTest{
	@Test
	public void GoToProductCreatingPageAndNevigateToProductImageInformation() throws Exception{


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

		//Take the crossor on "product image" Maximum 6 positive value
		//=======================================================================================

		productpage.getmy_file_element().sendKeys("D:\\Image\\image.jpg");

		productpage.getmy_file_element().sendKeys("D:\\Image\\image1.jpg");

		productpage.getmy_file_element().sendKeys("D:\\Image\\image2.jpg");

		productpage.getmy_file_element().sendKeys("D:\\Image\\image3.jpg");

		productpage.getmy_file_element().sendKeys("D:\\Image\\image4.jpg");

		productpage.getmy_file_element().sendKeys("D:\\Image\\image5.jpg");

		productpage.getmy_file_element().sendKeys("D:\\Image\\image6.jpg");

		Reporter.log(" 6 Positive value accepted, for negative value Browser tab is dissable",true);
		
        //Delete the Uploaded  files 
		//=======================================================================================
		for(int i=0;i<=6;i++){
			productpage.getdelete().click();
		}
        
	}
}

