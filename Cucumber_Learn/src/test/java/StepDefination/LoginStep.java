package StepDefination;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	@Given("Enter the url")
	public void enter_the_url() {
		
		System.out.println("enter the url");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("Enter the username")
	public void enter_the_username() {
	
		
		
		System.out.println("enter the username");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("Enter the password")
	public void enter_the_password() {
		System.out.println("enter the password");
	    // Write code here that turns the phrase above into concrete actions
	   //. throw new io.cucumber.java.PendingException();
	}

	@Then("Click on login button")
	public void click_on_login_button() {
		System.out.println("click on login button");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

}
