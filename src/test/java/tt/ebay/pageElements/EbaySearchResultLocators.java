package tt.ebay.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tt.utilities.SetupDrivers;

public class EbaySearchResultLocators {

	//Search Result Validation Locators
	@FindBy(xpath="//span[contains(text(),'shoes')]")
	public WebElement txtShoes;
	
	//Search Category - Without Page Factory Locators
	public String txtCategory (String Category){
	WebElement txtCategory = SetupDrivers.driver.findElement(By.xpath("//span[contains(text(),'"+Category+"')]"));
	return txtCategory.getText();
	}
	
	//Selecting Shirt
	@FindBy(xpath="//span[contains(text(),'Big & Tall Cotton Tee')]")
	public WebElement lnkShirtIteam;
}
