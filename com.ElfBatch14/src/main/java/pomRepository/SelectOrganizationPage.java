package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectOrganizationPage {
	public SelectOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="emailoptout")
	private WebElement emailopcheckbox;

	public WebElement getemailopcheckbox()
	{
		return emailopcheckbox;
	}

	@FindBy(name="assigned_user_id")
	private WebElement assignedUserdrop;
	public WebElement getassignedUserdrop()
	{
		return assignedUserdrop;
	}


}
