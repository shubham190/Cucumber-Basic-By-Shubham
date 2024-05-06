package StepDefination;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationStep {
	
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on registration page");
	    
	}

	@When("user enter following user details")
	public void user_enter_following_user_details(DataTable dataTable) {
	 
		List<List<String>>userlist=dataTable.asLists(String.class);
		
		for(List<String>li:userlist)
		{
			System.out.println(li);
		}
		   
	}
	
	@When("user enter following user details having columns")
	public void user_enter_following_user_details_having_columns(DataTable dataTable) {
		
		List<Map<String, String>>userlist =dataTable.asMaps(String.class,String.class);
		System.out.println(userlist);
	   
	}

	
	 

	@Then("user registraion sucessfully")
	public void user_registraion_sucessfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user registration sucessfully");
	    
	}


}
