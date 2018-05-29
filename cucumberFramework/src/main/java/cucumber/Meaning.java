package cucumber;
import managers.PagObjMngr;
import managers.MnginWebDriv;

public class Meaning {
	private MnginWebDriv webDriverManager;
	private PagObjMngr pageObjectManager;
	
	public Meaning(){
		webDriverManager = new MnginWebDriv();
		pageObjectManager = new PagObjMngr(webDriverManager.getDriver());
	}
	
	public MnginWebDriv getWebDriverManager() {
		return webDriverManager;
	}
	
	public PagObjMngr getPageObjectManager() {
		return pageObjectManager;
	}
 

}
