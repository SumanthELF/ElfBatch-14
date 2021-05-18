package genericLibrary;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
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

import pomRepository.LeadsPage;
import pomRepository.ContactPage;
import pomRepository.CreateNewContactPage;
import pomRepository.HomePage;
import pomRepository.LoginPage;

/*
 *Author DevikaPatel
 */
public class BaseTest implements IAutoConstants {
	public static WebDriver driver;
	public LoginPage loginpage;
	public HomePage homepage;
	public ContactPage contactpage;
	public CreateNewContactPage createnewcontactpage;
	public LeadsPage leads;
	public PropertyFileUtil data;
	public ExcelUtil excel;
	public WebDriverUtil webUtil;
	public SelectUtil select;
	public String parent;

	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void openApplication(@Optional("chrome")String browserName) throws Exception {
		//=====================================================================================================================
		// pre-condition : Launching the browser

		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY,CHROME_PATH);
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty(FIREFOX_KEY,FIREFOX_PATH);
			driver=new FirefoxDriver();
		}else {
			Reporter.log("enter valid browser name");
		}
		Reporter.log("Chrome is launching successfully",true);
		driver.manage().window().maximize();
		Reporter.log("Window is maximized successfully",true);
		data=new PropertyFileUtil();
		loginpage=new LoginPage(driver);
		homepage=new HomePage(driver);
		contactpage=new ContactPage(driver);
		createnewcontactpage=new CreateNewContactPage(driver);
		excel=new ExcelUtil();
		webUtil=new WebDriverUtil(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//======================================================================================================================
		//Step1 : navigate to CRM application

		String url =data.property(PROPERTIES_PATH,"url");
		driver.get(url);
		Assert.assertEquals(driver.getTitle(),"vtiger CRM 5 - Commercial Open Source CRM","Login page is not displayed successfully");
		Reporter.log("Login page is displayed successfully",true);
		parent=driver.getWindowHandle();

	}

	@BeforeMethod(alwaysRun=true)
	public void loginToApplication() throws Exception {
		String username=data.property(PROPERTIES_PATH,"username");
		String password=data.property(PROPERTIES_PATH,"password");
		loginpage.login(username, password);
		Assert.assertEquals(driver.getTitle(),"Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM","Homepage is not displayed successfully");
		Reporter.log("Homepage is displayed successfully",true);

	}
	//===========================================================================================================================
	@AfterMethod(alwaysRun=true)
	public void logoutFromApplication() {
		homepage.logout();
		Assert.assertEquals(driver.getTitle(),"vtiger CRM 5 - Commercial Open Source CRM","user is not logged out");
		Reporter.log("user is logged out successfully",true);

	}

	@AfterClass(alwaysRun=true)
	public void CloseApp() {
		driver.quit();
	}
}


