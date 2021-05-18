package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * Author DevikaPatel
 */
public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	@FindBy(linkText="Leads")
	private WebElement LeadsTab;

	public WebElement getLeadsTab() {
		return LeadsTab;
	}
	@FindBy(xpath="//a[text()='Contacts']")
			private WebElement Contacts;

	public WebElement getContacts() {
		return Contacts;
	}
		
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	       private WebElement Administrator;
	
	public WebElement getAdministrator() {
		return Administrator;
		
	}
	
	@FindBy(partialLinkText="Sign Out")
	       private WebElement Signout;

	public WebElement getSignout() {
		return Signout;
	}
	
	@FindBy(xpath="//a[text()='Products']")
	private WebElement  products;
	
	public WebElement getProducts() {
		return products;
	}

	public void logout(){
	Actions actions=new Actions(driver);
	actions.moveToElement(Administrator).perform();
	getSignout().click();

	}

}

	

