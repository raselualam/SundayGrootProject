package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import tt.ebay.pageElements.EbaySearchResultLocators;
import tt.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}
	
	public void verifyShoesItems(){
		
		//Option:1
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
		
		//Option:2
		Assert.assertEquals(EbaySearchResultLocatorsObj.txtShoes.getText(), "shoes");
	}
	
	public void verifyCategory(String Category){
		
		Assert.assertEquals(EbaySearchResultLocatorsObj.txtCategory(Category), Category);
	}
	
	public void selectItem(){
		
		EbaySearchResultLocatorsObj.lnkShirtIteam.click();
	}

}
