package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signup_page {

	@FindBy(xpath="//input[@id='fullName']")
	WebElement fullname;
	
    @FindBy(xpath="//input[@id='userEmail']")
    WebElement emailid;

    @FindBy(xpath="//input[@id='companyName']")
    WebElement companyname;

    @FindBy(xpath="")
    WebElement remember;
    
    @FindBy(xpath="//input[@id='userPassword']")
    WebElement password;

    @FindBy(xpath="//input[@id='userConfirmPassword']")
    WebElement confirmpassword;

    @FindBy(xpath="//a[text()='Terms and Conditions']")
    WebElement termsandconditionlink;
    
    @FindBy(xpath="//button[text()='SIGN UP']")
    WebElement submit;
    
    @FindBy(xpath="//a[text()='Login']")
    WebElement login;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	WebElement contactus;

	@FindBy(xpath="//a[text()='Terms & Conditions']")
	WebElement termsandcondtions;

	@FindBy(xpath="//a[text()='Privacy Policy']")
	WebElement privacypolicy;

}
