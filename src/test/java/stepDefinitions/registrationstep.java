package stepDefinitions;

import java.util.Map;

import org.testng.Assert;

import factory.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.RegistrationPage;

public class registrationstep {

	
@Given("Click on My Account Page")
public void click_on_my_account_page() {
	
	 HomePage hp = new HomePage(BaseClass.getDriver());
	 hp.clickMyAccount();
	 hp.clickRegister();
    
}

@Given("Click on registration link")
public void click_on_registration_link() {
  
	HomePage rb = new HomePage(BaseClass.getDriver());
	 
	 rb.clickRegister();
}

@When("User Enter the below Feilds")
public void user_enter_the_below_feilds(DataTable dataTable) {
	Map<String, String> dm = dataTable.asMap(String.class,String.class);
	
	RegistrationPage rp = new RegistrationPage(BaseClass.getDriver());
	
	rp.firstName(dm.get("firstName"));
	rp.lastName(dm.get("lastName"));
	rp.emailId(dm.get("email"));
	rp.password(dm.get("Password"));
	rp.confirmPassword(dm.get("Password"));
	rp.telephone(dm.get("telephone"));
	
	
	
	
	
}

@Then("Clcik on accept agreement")
public void clcik_on_accept_agreement() {

	RegistrationPage Rp = new RegistrationPage(BaseClass.getDriver());
	Rp.termCondition();
}

@Then("Click on the continue button")
public void click_on_the_continue_button() {
	RegistrationPage sb = new RegistrationPage(BaseClass.getDriver());
	sb.submit();
}

@Then("Registration is successfull")
public void registration_is_successfull() {
	RegistrationPage gm = new RegistrationPage(BaseClass.getDriver());
Assert.assertEquals(gm.getconfirmmsg(), "Your Account Has Been Created!");

}
}
