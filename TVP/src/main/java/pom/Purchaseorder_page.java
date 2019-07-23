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

	@FindBy(xpath="")
	WebElement cancel;

	@FindBy(xpath="")
	WebElement posearch;
	
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
		 
             driver.findElement(By.xpath("//span[contains(text(),'new')]")).click();
        
          
		 done.click();
	}
}
