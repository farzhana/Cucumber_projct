package stepDefns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FBsignupSteps {
	
	WebDriver driver = BaseClass.driver;
	
	@Given("^User has launched the FB Application$")
    public void user_has_launched_the_fb_application() throws Throwable {
		
		driver.get("https://en-gb.facebook.com/");
		   
		driver.manage().window().maximize();
		   
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS);
        
    }

    @When("^User click on the Create New Account Link$")
    public void user_click_on_the_create_new_account_link() throws Throwable {
    	
    	WebElement CreateNewAccount = driver.findElement(By.xpath("//*[text()='Create New Account']"));
    	CreateNewAccount.click();
    	
    }
    


    @And("^User creates the new Account$")
    public void user_creates_the_new_account(DataTable table) throws Throwable {
    	
    	String FirstName = table.cell(1,1);
    	String LastName = table.cell(2,1);
    	String MobileNumber = table.cell(3,1);
    	String Password = table.cell(4,1);
    	
    	WebElement tbFirstName = driver.findElement(By.name("firstname"));
    	WebElement tbLastName = driver.findElement(By.name("lastname"));
    	WebElement tbmobile = driver.findElement(By.name("reg_email__"));
    	WebElement tbpassword = driver.findElement(By.name("reg_password__"));
    	
    	tbFirstName.sendKeys(FirstName);
    	tbLastName.sendKeys(LastName);
    	tbmobile.sendKeys(MobileNumber);
    	tbpassword.sendKeys(Password);
    	
        
    }
    

    @And("^User enters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_enters_something_something_something_something(String firstname, String lastname, String mobilenumber, String password) throws Throwable {
        
    }

    @And("^User selects \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_selects_something_something_something(String date, String month, String year) throws Throwable {
       
    }

    @And("^User clicks on Signup button$")
    public void user_clicks_on_signup_button() throws Throwable {
        
    	WebElement signup = driver.findElement(By.xpath("//*[@name='websubmit']"));
    	signup.click();
    }
    
    @Then("^User should be able to see the success message$")
    public void user_should_be_able_to_see_the_success_message() throws Throwable {
        
    }

}
