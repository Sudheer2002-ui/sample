package StepDefination;

import org.testng.Assert;

import Pages.page1;
import Pages.page2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class sample2 {
	@When("User enters {string} the  username")
	public void user_enters_the_username(String string) {
	    page1.enterUsername(string);
	}

	@And("User enters {string} the password")
	public void user_enters_the_password(String string) {
	    page1.enterPassWord(string);
	}


	@And("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
	   page1.clickButton();
	}
	@When("User Verifies the login functionality")
	public void user_verifies_the_login_functionality() {
		Assert.assertEquals(page2.getStatic(), "Dashboard");
	}

}
