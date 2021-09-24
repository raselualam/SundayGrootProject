package tt.ebay.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tt.utilities.SetupDrivers;

public class EbayHomePageLocators {
	
	//Search Button - Without Page Factory Locators
	WebElement btnSearch2 = SetupDrivers.driver.findElement(By.xpath("//input[@value='Search']"));
	
	//Search Button - Page Factory Locators
	@FindBy(xpath="//input[@value='Search']")
	public WebElement btnSearch;


	//Search Text Box - Page Factory Locators
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch;
	
	//myEbay 
	@FindBy(xpath="//a[@title='My eBay']")
	public WebElement myEbay;

	//Summary btn
	@FindBy(xpath="//a[contains(text(),'Summary')]")
	public WebElement btnSummary;
}
