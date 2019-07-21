package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	
	public WebDriver launchdriver()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
