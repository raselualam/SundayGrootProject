package tt.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomePageActions;

public class EbayMyEbayMhSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	
	@When("^Mouse Hover to MyEbay Summary$")
	public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
		EbayHomePageActionsObj.mouseHoverMyebay();
	}

	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
		EbayHomePageActionsObj.clickSummary();
	}
}
