package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.PagObjMngr;
import managers.MnginWebDriv;
import reusablefunctions.Wrappers;

public class LoginPag extends Wrappers{
	WebDriver driver;
	Wrappers configFileReader;
	PagObjMngr pageObjectManager;
	MnginWebDriv webDriverManager;
	LoginPag loginpage;
	
	public LoginPag(WebDriver driver){
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
		}
	
@FindBy(how=How.XPATH, using= "//a[@class='login']")
private WebElement Link_signIn;
@FindBy(how=How.XPATH, using= "//h1[contains(text(),'Authentication')]")
private WebElement Title_Authentication;
@FindBy(how=How.XPATH, using= "//input[@id='email']")
private WebElement Textbox_Email;
@FindBy(how=How.XPATH, using= "//input[@id='passwd']")
private WebElement Textbox_Pwd;
@FindBy(how=How.XPATH, using= "//*[@id='SubmitLogin']")
private WebElement button_Signin;
@FindBy(how=How.XPATH, using= "//span[contains(text(),'Some one')]")
private WebElement Verify_Username;
@FindBy(how=How.XPATH, using= "//h1[contains(text(),'My account')]")
private WebElement Title_MyAccount;
@FindBy(how=How.XPATH, using= "//a[contains(text(),'T-shirts')]/following::*[contains(text(),'T-shirts')]")
private WebElement Option_Tshirts; 

    public void openApplication(){  
    	String url = properties.getProperty("url");
    	driver.get(url);
    	
    }
    public void clickSignIn(){
    	if(Link_signIn.isDisplayed()){
    	Link_signIn.click();
    	}
    }
	public void userLogin(){		
		if(Title_Authentication.isDisplayed()){
		String uname=properties.getProperty("uname");
		String pwd = properties.getProperty("pwd");		
		Textbox_Email.sendKeys(uname);	
		Textbox_Pwd.sendKeys(pwd);
		button_Signin.click();
	}
	}
	public void verifyUserName(){
		String ActualValue=Verify_Username.getText();
		String registeredUserName = properties.getProperty("registeredUserName");
		if(ActualValue.equalsIgnoreCase(registeredUserName)){
			System.out.println("The application opened for the registered user");
			String PageTitle=Title_MyAccount.getText();
		}
			}
	public void clickTshirt(){
		if(Title_MyAccount.isDisplayed()){
		Option_Tshirts.click();
	}
	}
	public void signIntotheapp(){
		openApplication();
		clickSignIn();
		userLogin();
		verifyUserName();
		clickTshirt();
	}
	
}
