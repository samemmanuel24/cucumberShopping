package Stepdefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.Meaning;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PagObjMngr;
import managers.MnginWebDriv;
import pageObjects.ChkotPag;
import pageObjects.LoginPag;
import pageObjects.OrdrHstPag;
import pageObjects.PymntPag;
import pageObjects.PrdctSelctnPag;
import pageObjects.UsrInfoPag;
import reusablefunctions.Wrappers;

public class TestFlow extends Pins {	
	
	public TestFlow(Meaning context) {
		super(context);
		}
	
	@Given("^user login to the application$")
	public void user_login_to_the_application() throws Throwable {
		loginpage.signIntotheapp();
		}
	
	@When("^user selects a product and add it to cart$")
	public void user_selects_a_product_and_add_it_to_cart() throws Throwable {	
		productselectionpage.selectProduct();
		checkoutpage.selectPaymentMode();
	    }	
	
	@And("^user orders a Tshirt$")
	public void order_summary_page_displayed_and_user_clicks_I_confirm_Order_button() throws Throwable {
		paymentpage.orderTshirt();
		}

	@Then("^order is reflecting in order history$")
	public void order_is_reflecting_in_order_history() throws Throwable {		
		orderhistorypage.verifyOrderHistory();
		}
	@When("^user updates personal information$")
	public void user_updates_personal_information() throws Throwable {
		userinformationpage.updatePersonalInfo();
		
	}
	
	@Then("^updates are saved in user info$")
	public void updates_are_saved_in_user_info() throws Throwable {
		 userinformationpage.validateUserInfoUpdated();
	
	
}
}
