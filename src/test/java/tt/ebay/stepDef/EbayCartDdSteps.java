package tt.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayCartDdActions;
import tt.ebay.pageAction.EbayHomePageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayCartDdSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	EbayCartDdActions EbayCartDdActionsObj = new EbayCartDdActions();
	
	@When("^Search for shirt$")
	public void search_for_shirt() throws Throwable {
		EbayHomePageActionsObj.searchShirt();
	}

	@When("^Select first shirt on item list$")
	public void select_first_shirt_on_item_list() throws Throwable {
		EbaySearchResultActionsObj.selectItem();
	}

	@When("^Select size$")
	public void select_size() throws Throwable {
		EbayCartDdActionsObj.selectSizeFromDd();
	}

	@When("^Select shade$")
	public void select_shade() throws Throwable {
		EbayCartDdActionsObj.selectShadeFromDd();
	}

	@Then("^Add to shopping cart$")
	public void add_to_shopping_cart() throws Throwable {
		EbayCartDdActionsObj.addToCart();
	}

}
