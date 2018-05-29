package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import enums.Drivers;
import enums.Environments;

public class MnginWebDriv {

	private WebDriver driver;
	private static Drivers driverType;
	private static Environments environmentType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
 
	public MnginWebDriv(){
	driverType = MnginFilRead.getInstance().getConfigReader().getBrowser();
		environmentType = MnginFilRead.getInstance().getConfigReader().getEnvironment();
	}
 
	public WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		return driver;
	}
 
	private WebDriver createDriver() {
		   switch (environmentType) {	    
	        case LOCAL : driver = createLocalDriver();
	        	break;
	        case REMOTE : driver = createRemoteDriver();
	        	break;
		   }
		   return driver;
	}
 
	private WebDriver createRemoteDriver() {
		throw new RuntimeException("RemoteWebDriver is not yet implemented");
	}
 
	private WebDriver createLocalDriver() {
	 switch (driverType) {	    
	 case FIREFOX : 
		 System.setProperty(FIREFOX_DRIVER_PROPERTY, MnginFilRead.getInstance().getConfigReader().getDriverPath());
		 driver = new FirefoxDriver();
	 	break;
	  case CHROME : 
	 	System.setProperty(CHROME_DRIVER_PROPERTY, MnginFilRead.getInstance().getConfigReader().getDriverPath());
     	driver = new ChromeDriver();
	 	break;
	   case INTERNETEXPLORER : driver = new InternetExplorerDriver();
	 		break;
	    }
 
	    if(MnginFilRead.getInstance().getConfigReader().getBrowserWindowSize()) driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(MnginFilRead.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
	 	return driver;
	 }	
 
	 public void closeDriver() {
	 	driver.close();
	 	driver.quit();
	 }
 
	
	
	
	
	
}
