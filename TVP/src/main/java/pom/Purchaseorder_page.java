package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Purchaseorder_page extends Login_page{

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
	
	@Test
	public void searchproduct()
	{
		PageFactory.initElements(driver, this);
		purchaseorderbutton.click();
		createorder.click();
		Set<String> popup = driver.getWindowHandles();
		Iterator<String> iterator = popup.iterator();
		String newwindow=null;
		while(iterator.hasNext())
		{
		newwindow=iterator.next();
		}
		driver.switchTo().window(newwindow);
		productsearch.sendKeys("prod");
		
	}
}
