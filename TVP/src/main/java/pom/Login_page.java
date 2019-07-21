package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_page {
	
				
	@FindBy(xpath="//input[@id='userEmail'")
	WebElement email;
	
	@FindBy(xpath="//input[@id='userPassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='checkbox']")
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
	
	@Test
	public void login()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://qa-tvp.kiwireader.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].click();",remember);
		
		driver.quit();
	}
	
    
}
