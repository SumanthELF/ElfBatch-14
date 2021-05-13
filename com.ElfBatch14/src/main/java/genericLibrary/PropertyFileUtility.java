package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PropertyFileUtility {
	public String property(WebDriver driver,String abspath,String data) throws IOException {
		FileInputStream fin = new FileInputStream(abspath);
		Properties property = new Properties();
		property.load(fin);
		String a = property.getProperty(data);
		return data;
	}
}
