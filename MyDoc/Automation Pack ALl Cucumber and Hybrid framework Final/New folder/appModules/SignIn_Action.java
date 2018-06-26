package appModules;

import pageObjects.BaseClass;
import pageObjects.LogIn_Page;
import utility.Constant;
import utility.ExcelUtils;


public class SignIn_Action {
	
	public static void executeSignIN(int iTestCaseRow) throws Exception
	{
		LogIn_Page lgn= new LogIn_Page(BaseClass.driver );
		String sUserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
        LogIn_Page.setUserName(sUserName);
        String sPassword = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
        LogIn_Page.setPassword(sPassword);
        LogIn_Page.clickLogIN();
     //   LogIn_Page.clickLogOUT();
	}

}
