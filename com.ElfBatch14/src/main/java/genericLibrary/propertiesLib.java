package genericLibrary;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class propertiesLib {
	public String readData(String absPath,String data) throws Exception {
		File file=new File(absPath);
		FileInputStream fin=new FileInputStream(file);
		Properties property=new Properties();
		property.load(fin);
		String value = property.getProperty(data);
		return value;

	}


}
