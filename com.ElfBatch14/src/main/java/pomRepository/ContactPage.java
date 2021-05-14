package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 *Author DevikaPatel
 */

public class ContactPage {
	WebDriver driver;
	public ContactPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}


	@FindBy(xpath="//img[contains(@src,'themes/softed/images/btnL3Add.gif')]")
	private WebElement PlusImage;


	public WebElement getPlusImage() {
		return PlusImage;
	}

	@FindBy(id="selectCurrentPageRec")
	private WebElement contactcheckbox;

	public WebElement getContactcheckbox() {
		return contactcheckbox;
	}

	@FindBy(xpath="//input[@name='selected_id' and @id='125']")
	private WebElement contactone;

	public WebElement getContactone() {
		return contactone;
	}

	@FindBy(xpath="//input[@name='selected_id' and @id='126']")
	private WebElement contacttwo;

	public WebElement getContacttwo() {
		return contacttwo;
	}

	@FindBy(xpath="//input[@name='selected_id' and @id='127']")
	private WebElement contactthree;

	public WebElement getContactthree() {
		return contactthree;
	}

	@FindBy(xpath="//input[@name='selected_id' and @id='128']")
	private WebElement contactfour;

	public WebElement getContactfour() {
		return contactfour;
	}

	@FindBy(xpath="//input[@class='crmbutton small delete' and @value='Delete']")
	private WebElement deletebutton;

	public WebElement getDeletebutton() {
		return deletebutton;
	}
}
