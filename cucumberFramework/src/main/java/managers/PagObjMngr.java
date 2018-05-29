package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.ChkotPag;
import pageObjects.LoginPag;
import pageObjects.OrdrHstPag;
import pageObjects.PymntPag;
import pageObjects.PrdctSelctnPag;
import pageObjects.UsrInfoPag;

public class PagObjMngr {

	public WebDriver driver;
	private ChkotPag checkoutpage;
	public LoginPag loginpage;
	private OrdrHstPag orderhistorypage;
	private PymntPag paymentpage;
	private PrdctSelctnPag productselectionpage;
	private UsrInfoPag userinformationpage;
	
	
	
	public PagObjMngr(WebDriver driver) {
		
		 
		this.driver = driver;
 
	}
	
	
	public LoginPag getLoginPage(){
		 
		return (loginpage == null) ? loginpage = new LoginPag(driver) : loginpage;
 
	}
	
	public PrdctSelctnPag getProductSelectionPage(){
		 
		return (productselectionpage == null) ? productselectionpage = new PrdctSelctnPag(driver) : productselectionpage;
 
	}
	public ChkotPag getCheckoutPage(){
		 
	return (checkoutpage == null) ? checkoutpage = new ChkotPag(driver) : checkoutpage;
 
	}
	public PymntPag getPaymentPage(){
		 
		return (paymentpage == null) ? paymentpage = new PymntPag(driver) : paymentpage;
 
	}
	public OrdrHstPag getOrderHistoryPage(){
		 
		return (orderhistorypage == null) ? orderhistorypage = new OrdrHstPag(driver) : orderhistorypage;
 
	}
	public UsrInfoPag getUserInformationPage() {
		return (paymentpage == null) ? userinformationpage = new UsrInfoPag(driver) : userinformationpage;
	}
	}
