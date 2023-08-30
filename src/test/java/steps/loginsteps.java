package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step - user is on login page");	
		}

	@When("user enters email and password")
	public void user_enters_email_and_password() {
		System.out.println("Inside Step - user enters email and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	
}
