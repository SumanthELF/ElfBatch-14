package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import pomRepository.CreateNewProductPage;
import pomRepository.HomePage;
import pomRepository.LoginPage;
import pomRepository.ProductListPage;

public class BaseTest implements IAutoConstants {
	public HomePage home;
	public CreateNewProductPage cnp;
	public ProductListPage pls;

	public static WebDriver driver;
	@Parameters("Browser")
	@BeforeClass(alwaysRun=true)
	
	
	//navigate to the application
	public void openApp(@Optional("firefox")String browser) throws EncryptedDocumentException, IOException {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY,CHROME_PATH);
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty(FIREFOX_KEY,FIREFOX_PATH);
			driver=new FirefoxDriver();
		}
		Reporter.log("Browser launched successfully",true);
		home=new HomePage(driver);
		cnp = new CreateNewProductPage(driver);
		pls=new ProductListPage(driver);
		driver.manage().window().maximize();
		Reporter.log("window maximized successfully",true);

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}	

	@BeforeMethod(alwaysRun=true)
	public void loginToApplication() throws EncryptedDocumentException, IOException {
		driver.get(DEFAULT_URL);
		Assert.assertEquals("vtiger CRM 5 - Commercial Open Source CRM",driver.getTitle(),"Login page is not displayed");
		Reporter.log("Login page is displayed",true);
		LoginPage login=new LoginPage(driver);
		login.login(driver,EXCEL_PATH);
	}

	@AfterClass(alwaysRun=true)
	public void logout() {
		Reporter.log("Logged out successfully",true);
	}

	@AfterMethod(alwaysRun=true)
	public void closeApplication() throws InterruptedException {

		Thread.sleep(4000);
		driver.quit();

	}
}
