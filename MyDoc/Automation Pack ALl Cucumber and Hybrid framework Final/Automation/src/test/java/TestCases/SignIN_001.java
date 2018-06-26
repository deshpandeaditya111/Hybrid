package TestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import appModules.SignIn_Action;
import pageObjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;

import utility.Utils;

import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class SignIN_001 {
	public static ExtentReports ext;
	public static ExtentTest test;
	public WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;

   
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  
  }
  
  @BeforeTest
  public void startReport() throws Exception
  {
	  ext=new ExtentReports("E:/Aditya/Project/abcd.html", true);
	//  ext= new ExtentReports("", true);
		 File f = new File("C:/Users/aditya/Neon_workspace/Automation/config/extent-config.xml");
		  ext.loadConfig(f);
		  test= ext.startTest("SignIN_Test");
		  test.log(LogStatus.PASS,"OpenBrowser");
		  sTestCaseName = this.toString();
		  sTestCaseName = Utils.getTestCaseName(this.toString());
		  ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,Constant.SheetName); 
		  iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		  driver = Utils.OpenBrowser(iTestCaseRow);
		  new BaseClass(driver);  
  }
  
  @Test
  public void SignIN_Test() throws Exception {
	  try
	  {
		
		SignIn_Action.executeSignIN(iTestCaseRow);
	  }
	  catch (Exception e)
	  {
		 Utils.takeScreenshot(driver, sTestCaseName);
	     throw (e);
	  }
	  
  }
  @AfterTest
  public void endReport()
  {
	  
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  driver.quit();
	  ext.endTest(test);	
ext.flush();
ext.close();
//	 
	 
  }

}
