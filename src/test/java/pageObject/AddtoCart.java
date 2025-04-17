package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddtoCart extends BasePage{

	public AddtoCart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@placeholder='Search']") WebElement search;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']") WebElement searchbtn;
	@FindBy(xpath="//span[normalize-space()='Add to Cart']") WebElement cart;
	@FindBy(xpath="//span[normalize-space()='Shopping Cart']") WebElement linkShop;
	@FindBy(xpath="//a[@class='btn btn-primary']") WebElement btnchk;
	
	
	
	
	
	public void SearchProduct(String str)
	{
		search.sendKeys(str);
	}
	
	public void SearchButton()
	{
		searchbtn.click();
	}
	
	public void AddTOcart()
	{
		Actions act=new Actions(driver);
		act.moveToElement(cart).click().build().perform();
		
	
	}
	
	public void linkShopingCart()
	{
		linkShop.click();
	}
	
	public void btnCheckOut()
	{
		btnchk.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
