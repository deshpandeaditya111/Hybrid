package pageObjects;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.*;

import utility.ReadProperty;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;


public class LogIn_Page extends BaseClass {
public static ReadProperty r=new ReadProperty();
private static WebElement element = null;
public static Properties prop;


public LogIn_Page(WebDriver driver){
    	super(driver);
    	 PageFactory.initElements(driver, this);
}     

@FindBy(id="j_username")
static
WebElement txtbox_UserName;

@FindBy(id="j_password")
static
WebElement txtbox_Password;

@FindBy(id="menuRight")
static
WebElement btn_LogIN;

@FindBy(className="submit")
static
WebElement btn_LogOUT;

public static void setUserName(String Username)
{
	txtbox_UserName.sendKeys(Username);
}

public static void setPassword(String Password)
{
	txtbox_Password.sendKeys(Password);
}

public static void clickLogIN()
{
	btn_LogIN.click();
}

public static void clickLogOUT()
{
	btn_LogOUT.click();
}
}
