package Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import UI_Components.LoginComponent;

public class FlightFinderComponentTest extends AbstractTest {
	
	@Test(description="Verfiy radio size",priority = 2)//you have set priority as you are working on different test
	
	public void verifyFlightFinder()
	{
		
		assertTrue(flightfindercomponet.verfiyNumberofRadio(),"Verify the no. of radio size ....");
		
	}

}
