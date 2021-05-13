package genericLibrary;


	import java.io.File;
	import java.io.FileInputStream;
	import java.util.Properties;

	public class PropertyFileUtil implements IAutoConstants {
		public String property(String abspath,String data) throws Exception
		{
			File file = new File(abspath); 
			FileInputStream fin=new FileInputStream(file);
			Properties property = new Properties();
			property.load(fin);
			String value = property.getProperty(data);
			return value;

		}

	}


