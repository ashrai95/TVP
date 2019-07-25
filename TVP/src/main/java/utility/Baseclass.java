package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

//	WebDriverManager.chromedriver().setup();
//	WebDriverManager.firefoxdriver().setup();
//	WebDriverManager.operadriver().setup();
//	WebDriverManager.phantomjs().setup();
//	WebDriverManager.edgedriver().setup();
//	WebDriverManager.iedriver().setup();

//	As I know, for now you can't manually add extension to safari from code.
//	But you can add it to safari manually and after that use System.setProperty("webdriver.safari.noinstall", "true"); property to stop uninstall it.
//	And you can also try to prepare safari using COM object or window process and add extension using some desktop automation.
	
	public static WebDriver driver;
	
	@BeforeClass
	public static WebDriver launchdriver() {
		
    	 WebDriverManager.chromedriver().setup();
    	 driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://qa-tvp.kiwireader.com");
	     return driver;
	}
	
	//@AfterClass
	public static void closeBrowser()
	{
		driver.quit();
	}
	
	public static boolean scrolltoview(WebDriver driver,WebElement element)
	{
		try
		{
			String scrollelementintomiddle = "var viewportheight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);" + "var elementtop = arguments[0].getBoundingClientRect().top;" + "window.scrollBy(0,elementtop-(viewportheight/2));";
            ((JavascriptExecutor)driver).executeScript(scrollelementintomiddle, element);
            return true;
		}
		catch (Exception e)
		{
		System.out.println("Exception in baseclass"+ e);
		return false;
		}
	}
}
