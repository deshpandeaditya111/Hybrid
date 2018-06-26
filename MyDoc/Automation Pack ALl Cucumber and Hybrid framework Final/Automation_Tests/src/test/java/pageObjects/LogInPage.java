package pageObjects;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	public LogInPage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	 @FindBy(id="j_username")
	 WebElement txtbx_userName;
	 
	 @FindBy(id="j_password")
	 WebElement txtbx_Password;
	 
	 @FindBy(id="submit")
	 WebElement btn_LogIn;
	 
	public void enter_Name(String name) {
		txtbx_userName.sendKeys(name);
	}
	
	public void enter_Password(String password) {
		txtbx_Password.sendKeys(password);
	}
	
	public void click_SignIn() {
		btn_LogIn.click();
	}
	
	
	public void SignIn(String User, String Password)
	{
		enter_Name(User);
		enter_Password(Password);
		click_SignIn();
	}

}