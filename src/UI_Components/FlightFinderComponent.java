package UI_Components;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bds_Queries.serviceCall;

public class FlightFinderComponent {
	@FindBy(xpath="//input[@type='radio'][@name='tripType']")
	static List<WebElement> radioButton;
	
	
	public boolean verfiyNumberofRadio()
	{
		int actualradiosize=radioButton.size();
		int expectedradiosize=serviceCall.getRadiosize();
		
		if(actualradiosize==expectedradiosize)
		{
			return true;
		}
		return false;
}
	
	
}
