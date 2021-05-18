package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * Author DevikaPatel
 */
public class LoginPage {
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(name="user_name")
	private WebElement usernameTextField;
	
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	public void login(String username,String password){   
		getUsernameTextField().clear();
		getUsernameTextField().sendKeys(username);
		getPasswordTextField().clear();
		getPasswordTextField().sendKeys(password);
		getLoginButton().click();
	}
}
