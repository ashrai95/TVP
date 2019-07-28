package pom;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.SubmissionPublisher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(xpath="//input[@class='number required_size']")
	List<WebElement> quantity;
	
	@FindBy(xpath="//div[@id='order_total_quantity']")
	WebElement totalquantity;
	
	@FindBy(xpath="//a[@id='choose-products-btn']")
	WebElement addmoreproducts;

	@FindBy(xpath="//div[@class='production-summary-panel card_click']//following-sibling::label")
	List<WebElement> productiontime;

	@FindBy(xpath="//textarea[@name='data[order][clientNote]']")
	WebElement clientnotes;
	
	@FindBy(xpath="//div[@class='production-panel-head']")
	WebElement ptime;

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
	
	//Order creation page - Order finishing page
	@FindBy(xpath="//div[@class='input-field select-finishing-div mainclassOfFinishingOrder']")
	WebElement finishing;
	
	@FindBy(xpath="//input[@class='select-dropdown dropdown-trigger']/following::li")
	List<WebElement> finishingtype;
	
	@FindBy(xpath="//textarea[@name='data[OrderFinishingTag][1][note]']")
	WebElement orderfinishingnotes;
	
	@FindBy(xpath="//button[text()='Add Additional Finishing']")
	WebElement addadditionalfinishing;
	
	//Order creation page - Shipping Address
	@FindBy(xpath="//a[text()='Choose Shipping Address']")
	WebElement chooseshipping;
	
	@FindBy(xpath="//div[@class='col s6 card ship-box-div card_click']")
	List<WebElement> shippingaddress;
	
	@FindBy(xpath="//div[@class='shipping-address-done-buttons']/button")
	WebElement shippingdone;
	
	@FindBy(xpath="//input[@class='number required_ship_size changeInput shipment_quantity']")
	List<WebElement> shippingquantity;
	
	@FindBy(xpath="//div[@class='input-field custom-input select-wrappers']//input[@class='select-dropdown dropdown-trigger']")
	WebElement shippingdropdown;
	
	@FindBy(xpath="//input[@class='select-dropdown dropdown-trigger']/following::li[@id]")
	List<WebElement> shippingmethod;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	
	@Test
	public void searchproduct() throws InterruptedException
	{
		PageFactory.initElements(driver, this);
		purchaseorderbutton.click();
		createorder.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(productsearch));
		
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
		
		//System.out.println(checkbox.size());
		 
         checkbox.get(0).click();
		 done.click();
		 for(int i=0; i<quantity.size(); i++)
		 {
			 quantity.get(i).sendKeys("10");
		 }
		 scrolltoview(driver, ptime);
		 productiontime.get(0).click();
		 next.click();
		 
		 //Order finishing
		/* scrolltoview(driver, addadditionalfinishing);
		 if(finishing.isDisplayed()==true)
		 {
		 finishing.click();
		 finishingtype.get(0).click();
		 }
		 */
		 wait.until(ExpectedConditions.elementToBeClickable(finishing));
		 finishing.click();
		 finishingtype.get(1).click();
		
		// Thread.sleep(500);
		 next.click();
		 
		 //Shipping address choose
		 wait.until(ExpectedConditions.elementToBeClickable(chooseshipping));
		 chooseshipping.click();
		 Set<String> popupaddress = driver.getWindowHandles();
			Iterator<String> iteratoraddress = popupaddress.iterator();
			String newwindowaddress=null;
			while(iteratoraddress.hasNext())
			{
			newwindowaddress=iteratoraddress.next();
			}
			driver.switchTo().window(newwindowaddress);
			Thread.sleep(500);
			shippingaddress.get(0).click();
			shippingdone.click();
		    
			wait.until(ExpectedConditions.elementToBeClickable(shippingdropdown));
			for(int j=0; j<shippingquantity.size(); j++)
			 {
				 shippingquantity.get(j).sendKeys("10");
			 }
			
			scrolltoview(driver, shippingdropdown);
			 shippingdropdown.click();
			 shippingmethod.get(2).click();
			wait.until(ExpectedConditions.elementToBeClickable(next)).click();;	 
			Actions action=new Actions(driver);
			action.moveToElement(next).build().perform();
			submit.click();
			
		 
	}
}
