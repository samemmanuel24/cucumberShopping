package Stepdefinition;

import cucumber.Meaning;
import pageObjects.ChkotPag;
import pageObjects.LoginPag;
import pageObjects.OrdrHstPag;
import pageObjects.PymntPag;
import pageObjects.PrdctSelctnPag;
import pageObjects.UsrInfoPag;

public class Pins {
	Meaning testContext;
	ChkotPag checkoutpage;
	LoginPag loginpage;
	OrdrHstPag orderhistorypage;
	PymntPag paymentpage;
	PrdctSelctnPag productselectionpage;
	UsrInfoPag userinformationpage;
	
	
	 
	public Pins(Meaning context) {
		testContext = context;
		checkoutpage = testContext.getPageObjectManager().getCheckoutPage();
		loginpage = testContext.getPageObjectManager().getLoginPage();
		orderhistorypage = testContext.getPageObjectManager().getOrderHistoryPage();
		paymentpage = testContext.getPageObjectManager().getPaymentPage();
		productselectionpage = testContext.getPageObjectManager().getProductSelectionPage();
		userinformationpage = testContext.getPageObjectManager().getUserInformationPage();
	}	
}
