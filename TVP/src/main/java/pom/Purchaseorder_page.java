package pom;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Purchaseorder_page extends Login_page{

	
	//Purchase Order page objects
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
	
	@FindBy(xpath="//div[@class='stock-checkbox']")
	List<WebElement> checkbox;

	@FindBy(xpath="//button[@id='prd-btn-select' and text()='Done']")
	WebElement done;

	@FindBy(xpath="//button[@id='prd-btn-select' and text()='Done']/preceding-sibling::a")
	WebElement cancel;

	@FindBy(xpath="")
	WebElement posearch;
	
	//Order creation page - Order quantity page
	
	@FindBy(xpath="placeholder='Add QTY'")
	List<WebElement> quantity;
	
	@FindBy(xpath="//div[@id='order_total_quantity']")
	WebElement totalquantity;
	
	@FindBy(xpath="//a[@id='choose-products-btn']")
	WebElement addmoreproducts;

	@FindBy(xpath="//div[@class='summary-div']")
	List<WebElement> productiontime;

	@FindBy(xpath="//textarea[@name='data[order][clientNote]']")
	WebElement clientnotes;

	@FindBy(xpath="//span[@id='selling_total_price_foot']")
	WebElement totalpricefooter;

	@FindBy(xpath="//span[@id='selling_per_price_foot']")
	WebElement unitpricefooter;

	@FindBy(xpath="//span[@class='prduction-type']")
	WebElement productiontypefooter;

	@FindBy(xpath="//a[@class='tooltip getSellPrice']")
	WebElement refresh;

	@FindBy(xpath="//button[text()='Next']")
	WebElement next;
	
	//Order creation page - Order quantity page
	@FindBy(xpath="//div[@class='input-field select-finishing-div mainclassOfFinishingOrder']")
	WebElement finishingtype;
	
	@FindBy(xpath="//textarea[@name='data[OrderFinishingTag][1][note]']")
	WebElement orderfinishingnotes;
	
	@FindBy(xpath="//button[text()='Add Additional Finishing']")
	WebElement addadditionalfinishing;
	
	//Order creation page - Shipping Address
	@FindBy(xpath="//a[text()='Choose Shipping Address']")
	WebElement chooseshipping;
	
	@FindBy(xpath="//div[@class='col s6 card ship-box-div card_click']")
	List<WebElement> shippingaddress;
	
	//@FindBy(xpath="")
	//WebElement ;
	@Test
	public void searchproduct() throws InterruptedException
	{
		PageFactory.initElements(driver, this);
		purchaseorderbutton.click();
		createorder.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(productsearch));
		
		Set<String> popup = driver.getWindowHandles();
		Iterator<String> iterator = popup.iterator();
		String newwindow=null;
		while(iterator.hasNext())
		{
		newwindow=iterator.next();
		}
		driver.switchTo().window(newwindow);
		
		productsearch.sendKeys("prod");
		Thread.sleep(2000);
		
		System.out.println(checkbox.size());
		//Iterator<WebElement> listelement=checkbox.iterator();
		 
             //driver.findElement(By.xpath("//span[contains(text(),'new')]")).click();
        
          checkbox.get(0).click();
		 done.click();
	}
}
