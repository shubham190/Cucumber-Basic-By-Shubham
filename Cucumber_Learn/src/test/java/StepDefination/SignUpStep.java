package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStep {
	
	@Given("Enter the user registration form")
	public void enter_the_user_registration_form() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user registration");
	    
	}

	@When("Enter the username and password")
	public void enter_the_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	
	   System.out.println("username and password");
	    
	}

	@Then("Enter the email id and phone number")
	public void enter_the_email_id_and_phone_number() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("email id and phone number");
	    
	}

	@Then("Click on sign up button")
	public void click_on_sign_up_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click sign up button");
	    
	}

}
