package UI_Components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bds_Queries.serviceCall;

public class LoginComponent {
	
	
	//PageFactory
	
	@FindBy(name="userName")
	static WebElement usernameEditbox;
	
	
	@FindBy(name="password")
	static WebElement passwordEditbox;
	
	
	//input[@name='login']
	@FindBy(xpath="//input[@name='login']")
	static WebElement loginButton;
	
	@FindBy(xpath="//font[text()][1]")
	WebElement loginVerification;
	
	
	public void login()
	{
		usernameEditbox.sendKeys("batman");
		passwordEditbox.sendKeys("batman");
		loginButton.click();
	}
	
	public boolean verfiyLoginFunc()
	{
		login();
		String actualText=loginVerification.getText();
		//String expectedText="";
		
		//Latter added
		String expectedText=serviceCall.getloginVerficationText(); /////////import bds_Queries.serviceCall;
		if(actualText.equals(expectedText))
	
		return true;
		
		else
			
		return false;
	
		
		
	}
	//radiobutton
	//input[@type='radio'] //give 5 radios
	//input[@type='radio'][@name='tripType']

	
	
	
	

	
	
	
	
	//SELECT[@name='passCount']/option[contains(text(),4)]
	
	
	//select[@name='fromPort']//following::option[@value='New York']  //gives 2 elements
	//select[@name='fromPort']/option[@value='New York'] //gives exact 1 elements (to avoid siblings..)
	//otherway dropdown
	//select[@name='fromPort']/option[contains(text(),'New York')]////gives exact 1 elements (to avoid siblings..)
	
	
	//input[@name='servClass'][@value='Business']
	
	
	//select[@name='fromPort']//following::option[@value] //gives 106 elements
	//select[@name='fromPort']/option[@value]  //gives exact 10 elements (to avoid siblings..)

}
