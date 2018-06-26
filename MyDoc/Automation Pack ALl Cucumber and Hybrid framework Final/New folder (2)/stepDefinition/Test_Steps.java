package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LogInPage;

public class Test_Steps {
	public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	//	http://dt-aditya.technologic.com:9900/eQubeMI
		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://dt-aditya.technologic.com:9900/eQubeMI");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		 driver.get("http://dt-aditya.technologic.com:9900/eQubeMI");
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {

		LogInPage lgn= new LogInPage(driver);
		lgn.SignIn("ADMIN", "ADMIN@12345");
//		driver.findElement(By.id("j_username")).sendKeys("ADMIN");
//		driver.findElement(By.id("j_password")).sendKeys("ADMIN@12345");
//		driver.findElement(By.id("submit")).click();

		System.out.println("Title is="+driver.getTitle());
		
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Success");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {

	driver.switchTo().frame("eQPage");
	driver.switchTo().frame("MenuPane");
	driver.findElement(By.id("Menu8")).click();;

	System.out.println("="+driver.getCurrentUrl());
		System.out.println("Logout Success");
		
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("Logout Success");
	}
	@When("^User enters Invalid UserName and Valid Password$")
	public void user_enters_Invalid_UserName_and_Valid_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("j_username")).sendKeys("ABCD");
		driver.findElement(By.id("j_password")).sendKeys("ADMIN@12345");
		driver.findElement(By.id("submit")).click();
	}

	
	@Then("^Message displayed Login Failed !$")
	public void message_displayed_Login_Failed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Failed ! Please Enter Valid Credentials");
	}
	@When("^User enters UserName and Incorrect Password$")
	public void user_enters_UserName_and_Incorrect_Password() throws Throwable {

		LogInPage lgn= new LogInPage(driver);
		lgn.SignIn("ADMIN", "ADMIN@1235");
	  
	}

}
