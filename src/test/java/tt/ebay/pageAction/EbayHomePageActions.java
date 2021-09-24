package tt.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tt.ebay.pageElements.EbayHomePageLocators;
import tt.utilities.SetupDrivers;

public class EbayHomePageActions {
	
	EbayHomePageLocators EbayHomePageLocatorsObj;
	WebDriverWait Wait = new WebDriverWait(SetupDrivers.driver, 30);
	
	public EbayHomePageActions(){
		EbayHomePageLocatorsObj = new EbayHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsObj);
	}

	public void loadEbayHomepage() throws Exception{
		SetupDrivers.driver.get("https://www.ebay.com/");
		
		//Implicit Wait
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Explicit Wait
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='gh-ac']")));
		
		//Hard Pause
		Thread.sleep(3000);
	}
	
	public void searchShoes(){
		
		EbayHomePageLocatorsObj.txtbxSearch.clear();
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shoes");
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	
	public void searchProducts(String Products){
		EbayHomePageLocatorsObj.txtbxSearch.clear();
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(Products);
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	
	public void searchShirt(){
		
		EbayHomePageLocatorsObj.txtbxSearch.clear();
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Big & Tall Cotton Tee");
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	
	public void mouseHoverMyebay() throws InterruptedException{
		//Click on summary by mouse hovering myEbay
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(EbayHomePageLocatorsObj.myEbay);
		actions.perform();
		Thread.sleep(3000);
	}

	public void clickSummary() throws InterruptedException {
		EbayHomePageLocatorsObj.btnSummary.click();
		Thread.sleep(3000);
	}
}
