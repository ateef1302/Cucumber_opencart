package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AddtoCart;

public class AddCartSteps {

	


	@Given("Search Imac product")
	public void search_imac_product() throws InterruptedException {
		  AddtoCart sp = new AddtoCart(BaseClass.getDriver());
		  sp.SearchProduct("imac");
		  Thread.sleep(2000);
	}

	@When("click on the search button")
	public void click_on_the_search_button() throws InterruptedException {
		 AddtoCart btn = new AddtoCart(BaseClass.getDriver());
		 btn.SearchButton();
		 Thread.sleep(2000);
	}

	@And("Add the product to cart")
	public void add_the_product_to_cart() throws InterruptedException {
	  
		AddtoCart add = new AddtoCart(BaseClass.getDriver());
		
		add.AddTOcart();
		 Thread.sleep(2000);
	}

	@And("Go to the cart")
	public void go_to_the_cart() throws InterruptedException {
		
		AddtoCart shp = new AddtoCart(BaseClass.getDriver());
		
	   shp.linkShopingCart();
	   Thread.sleep(2000);
	}	
	
	@Then("Checkout product")
	public void checkout_product() throws InterruptedException {
		
		AddtoCart chk = new AddtoCart(BaseClass.getDriver());
		chk.btnCheckOut();
		 Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
