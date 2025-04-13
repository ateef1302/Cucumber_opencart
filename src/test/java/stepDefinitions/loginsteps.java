package stepDefinitions;

import java.util.Properties;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;


public class loginsteps {
public Properties p;

@Given("the user navigates to login page")
public void the_user_navigates_to_login_page() {
	
	
	
	HomePage hp = new HomePage(BaseClass.getDriver());
	hp.clickMyAccount();
	hp.clickLogin();
	
    
}

@When("user enters email as {string} and password as {string}")
public void user_enters_email_as_and_password_as(String email, String password) {
	
	
	LoginPage lp = new LoginPage(BaseClass.getDriver());
	lp.setEmail(email);
	lp.setPassword(password);
 
}

@When("the user clicks on the Login button")
public void the_user_clicks_on_the_login_button() {
	LoginPage lp = new LoginPage(BaseClass.getDriver());
	lp.clickLogin();
}

@Then("the user should be redirected to the MyAccount Page")
public void the_user_should_be_redirected_to_the_my_account_page() {

	 MyAccountPage macc = new MyAccountPage(BaseClass.getDriver());
			 boolean targetpage = macc.isMyAccountPageExists();
	Assert.assertEquals(targetpage, true);  
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
