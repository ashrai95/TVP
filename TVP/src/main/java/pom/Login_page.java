package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Baseclass;

public class Login_page extends Baseclass {
	
				
	@FindBy(xpath="//input[@id='userEmail']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='userPassword']")
	WebElement password;
	
	@FindBy(xpath="//div[@class='checkbox-wrapper remember-me']")
	WebElement remember;
		
	@FindBy(xpath="//a[@class='forgot-link']")
	WebElement forgotpassword;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginbutton;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signupbutton;

	@FindBy(xpath="//a[text()='Contact Us']")
	WebElement contactus;

	@FindBy(xpath="//a[text()='Terms & Conditions']")
	WebElement termsandcondtions;

	@FindBy(xpath="//a[text()='Privacy Policy']")
	WebElement privacypolicy;
	
	
	@BeforeClass
	public void login()
	{
      PageFactory.initElements(driver, this);
	  email.sendKeys("ashish.rai@kiwitech.com");//pre-vinisha.rai@kiwitech.com//vini@yopmail.com
	  password.sendKeys("Passw0rd#");//
	  remember.click();
	  loginbutton.click();
	}
	
    
}
