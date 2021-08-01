package stepDefns;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {
	
	int result;
	
	 @Given("^the calculator application is open$")
	    public void the_calculator_application_is_open() throws Throwable {
	       
		 System.out.println("Calculator App is open");
		 
	    }

	    @When("^I add two numbers \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void i_add_two_numbers_something_and_something(int num1, int num2) throws Throwable {
	        
	    	 result = num1 + num2;
	    }
	    
	    @When("^I multiply two numbers \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void i_multiply_two_numbers_something_and_something(int num1, int num2) throws Throwable {
	        
	    	 result = num1*num2;
	    }
	    
	    @Then("^I should get the result as \"([^\"]*)\"$")
	    public void i_should_get_the_result_as_something(int ExpResult) throws Throwable {
	        
	    	/*if(result==ExpResult) {
	    		System.out.println("Test Passed");
	    	}else {
	    		System.out.println("Test Failed");
	    	}*/
	    	
	    	Assert.assertEquals(ExpResult, result);
	    }
}
	    



