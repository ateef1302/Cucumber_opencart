package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

	public RegistrationPage(WebDriver driver) {
		super(driver);
		
	}

//locators
	@FindBy(xpath=("//input[@id='input-firstname']")) WebElement fname;
	@FindBy(xpath=("//input[@id='input-lastname']")) WebElement lname;
	@FindBy(xpath=("//input[@id='input-email']")) WebElement email;
	@FindBy(xpath=("//input[@id='input-telephone']")) WebElement tel;
	@FindBy(xpath=("//input[@id='input-password']")) WebElement pass;
	@FindBy(xpath=("//input[@id='input-confirm']")) WebElement conf_pass;
	
	@FindBy(xpath=("//input[@name='agree']")) WebElement terms;

	@FindBy(xpath=("//input[@value='Continue']")) WebElement btn;
	
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement confirmmsg;
	
	//Actions
	
	public void firstName(String name)
	{
		fname.sendKeys(name);
	}
	
	public void lastName(String surname)
	{
		lname.sendKeys(surname);
	}	
	
	
	public void emailId(String id)
	{
		email.sendKeys(id);
	}
	
	public void telephone(String phn)

	{
		tel.sendKeys(phn);
	}

	public void password(String pwd)
	{
		pass.sendKeys(pwd);
	}

	public void confirmPassword(String pwd)
	{
		conf_pass.sendKeys(pwd);
	}
	
	public void termCondition()
	{
		terms.click();
		
	}
	
	public void submit()
	{
		btn.click();
	}
	
	public String getconfirmmsg()
	{
		try
		{
			return (confirmmsg.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	
	
}
