package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartDdLocators {

	//Shirt size
	@FindBy(xpath="//select[@id='msku-sel-2']")
	public WebElement ddSize;
	
	//Shirt shade
	@FindBy(xpath="//select[@name='Shade']")
	public WebElement ddShade;
	
	//Add to Cart
	@FindBy(xpath="//a[@id='atcRedesignId_btn']")
	public WebElement btnAddCart;
}
