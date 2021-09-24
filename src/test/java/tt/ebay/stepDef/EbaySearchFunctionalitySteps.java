package tt.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomePageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbaySearchFunctionalitySteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		EbayHomePageActionsObj.loadEbayHomepage();
	}

	@When("^Search for Shoes$")
	public void search_for_Shoes() throws Throwable {
		EbayHomePageActionsObj.searchShoes();
	}

	@Then("^Item list should have only Shoes related products$")
	public void item_list_should_have_only_Shoes_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyShoesItems();
	}
	
	@When("^Search for specific \"([^\"]*)\"$")
	public void search_for_specific(String Products) throws Throwable {
		EbayHomePageActionsObj.searchProducts(Products);
	}

	@Then("^Item list should have only specific \"([^\"]*)\"$")
	public void item_list_should_have_only_specific(String Category) throws Throwable {
		EbaySearchResultActionsObj.verifyCategory(Category);
	}
}
