package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import tt.ebay.pageElements.EbayCartDdLocators;
import tt.utilities.ReadExcelSheet;
import tt.utilities.SetupDrivers;

public class EbayCartDdActions {

	EbayCartDdLocators EbayCartDdLocatorsObj;
	WebDriverWait Wait = new WebDriverWait(SetupDrivers.driver, 30);
	
	public EbayCartDdActions(){
		EbayCartDdLocatorsObj = new EbayCartDdLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartDdLocatorsObj);
	}
	
	public void selectSizeFromDd() throws Exception{
		
		//Selenium Dropdown
		Select myDD= new Select(EbayCartDdLocatorsObj.ddSize);
//		myDD.selectByVisibleText("4XLT");
		myDD.selectByVisibleText(ReadExcelSheet.getMapData("Size"));
		Thread.sleep(2000);
	}
	
	public void selectShadeFromDd() throws Exception{
		
		//Selenium Dropdown
		Select myDD= new Select(EbayCartDdLocatorsObj.ddShade);
//		myDD.selectByVisibleText("White");
		myDD.selectByVisibleText(ReadExcelSheet.getMapData("Shade"));
		Thread.sleep(2000);
	}
	
	public void addToCart() throws Exception {
		EbayCartDdLocatorsObj.btnAddCart.click();
		Thread.sleep(5000);
	}
}
