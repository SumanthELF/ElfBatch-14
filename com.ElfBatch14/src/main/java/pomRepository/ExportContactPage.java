package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExportContactPage {
	
	public ExportContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='Export']")
	private WebElement export;
	
	@FindBy(xpath="//td[text()='Export data in current page']")
	private WebElement exportDataInCurrentPage;

	public WebElement getExportDataInCurrentPage() {
		return exportDataInCurrentPage;
	}

	public WebElement getExport() {
		return export;
	}
	

}
