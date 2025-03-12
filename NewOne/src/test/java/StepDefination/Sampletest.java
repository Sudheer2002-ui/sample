package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.testng.Assert;

import Browser.Browser;
import Pages.page1;
public class Sampletest {
	@Given("User opens the browser")
	public void user_opens_the_browser() throws Exception {
	    Browser.openBrowser();
	}
	@And("User navigates to the {string} web page")
	public void user_navigates_to_the_web_page(String string) throws Exception {
	    Browser.navigateToUrl(string);
	}
	@Then("User verifies the title of the  Webpage")
	public void user_verifies_the_title_of_the_webpage() {
	   Assert.assertEquals(page1.getTitle(), "OrangeHRM");
	}
	

	@And("User closes the browser")
	public void user_closes_the_browser() {
		Browser.closeBrowser();
	}
	
}
