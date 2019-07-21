package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_Products {

	@FindBy(xpath="//a[@id='my-product-menu']")
	WebElement myproductsbutton;
	
	@FindBy(xpath="//a[text()='My Products']")
	WebElement myproducts;
	
	@FindBy(xpath="//a[text()='Pending Products']")
	WebElement pendingproducts;
	
	@FindBy(xpath="//a[text()='Inactive Products']")
	WebElement inactiveproducts;
	
	@FindBy(xpath="//a[text()='Draft']")
	WebElement draft;
	
	@FindBy(xpath="//a[text()='Export']")
	WebElement export;
	
	@FindBy(xpath="//button[text()='Get an Estimate']")
	WebElement getanestimate;
	
	@FindBy(xpath="//input[@id='searchboxheader']")
	WebElement searchbox;
	

}
