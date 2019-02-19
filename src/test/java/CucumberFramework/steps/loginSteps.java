package CucumberFramework.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginSteps {
	
	@Given("^User navigates to the stackoverflow webstite$")
	public void user_navigates_to_the_stackoverflow_webstite() throws Throwable {
	    System.out.println("Test");
	}

	@Given("^User clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
		System.out.println("Test2");
	}

	@Given("^User enters valid username$")
	public void user_enters_valid_username() throws Throwable {
		System.out.println("Test3");
	}

	@Given("^User enters valid password$")
	public void user_enters_valid_password() throws Throwable {
		System.out.println("Test4");
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		System.out.println("Test5");
	}

	@Then("^User should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
		System.out.println("Test6");
	}
}
