package stepDefns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = BaseClass.driver;
	
	
	   @Given("^user has opened simplilearn application$")
	    public void user_has_opened_simplilearn_application() throws Throwable {
	      
		   driver.get("http://www.simplilearn.com/");
		   
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS);
	    }

	    @When("^user clicks on login link$")
	    public void user_clicks_on_login_link() throws Throwable {
	    	
	    	WebElement loginLink = driver.findElement(By.xpath("//*[@class='login']"));
	    	loginLink.click();
	    
	    }
	       

	    @And("^user enters correct username \"([^\"]*)\"$")
	    public void user_enters_correct_username_something(String username) throws Throwable {
	    	
	    	WebElement UserName = driver.findElement(By.name("user_login"));
	    	UserName.sendKeys(username);
	       
	    }

	    @And("^user enters correct pasword \"([^\"]*)\"$")
	    public void user_enters_correct_pasword_something(String password) throws Throwable {
	    	
	    	WebElement Password = driver.findElement(By.id("password"));
	    	Password.sendKeys(password);
	        
	    }

	    @And("^user clicks on Login button$")
	    public void user_clicks_on_login_button() throws Throwable {
	    	
	    	WebElement LoginButton = driver.findElement(By.name("btn_login"));
	    	LoginButton.click();
	       
	    }
	    
	    @Then("^user should be landed on the home page$")
	    public void user_should_be_landed_on_the_home_page() throws Throwable {
	       
	    }

	    @And("^user should be able to see the welcome page$")
	    public void user_should_be_able_to_see_the_welcome_page() throws Throwable {
	        
	    }

}
