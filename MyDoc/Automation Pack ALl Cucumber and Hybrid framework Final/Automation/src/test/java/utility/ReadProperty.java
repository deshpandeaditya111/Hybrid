package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	public static Properties prop;
	public Properties read() throws IOException
	{  
		FileInputStream file = new FileInputStream(Constant.Path_Config_File);
		prop = new Properties();
		prop.load(file);        //Load the pro
		return prop;
	 	
	}
//	public String getUserName_Identifier()
//	{
//		return null;
//	}
//	public String getPassword_Identifier()
//	{
//		return null;
//	}
//	public String getLoginButton_Identifier()
//	{
//		return null;
//	}
//	public String getUserName_Value()
//	{
//		return null;
//	}
//	public String getPassword_Value()
//	{
//		return null;
//	}
}
