package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Purchaseorder_page {

	@FindBy(xpath="//a[contains(.,'Purchase Order')]")
	WebElement purchaseorderbutton;
	
	@FindBy(xpath="//a[text()='Create Order']")
	WebElement createorder;
	
	@FindBy(xpath="//a[text()='Export']")
	WebElement export;
	
	@FindBy(xpath="//input[@class='select-dropdown dropdown-trigger']")
	WebElement filterdropdown;
	
	@FindBy(xpath="//input[@class='prdSearch']")
	WebElement productsearch;
	
	@FindBy(xpath="")
	WebElement checkbox;

	@FindBy(xpath="//div[@class='add-modal-footer text-right']/preceding::button[text()='Done']")
	WebElement done;

	@FindBy(xpath="")
	WebElement cancel;

	@FindBy(xpath="")
	WebElement posearch;
}
