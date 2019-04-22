package Test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import UI_Components.LoginComponent;

public class LoginTest extends AbstractTest
	{
		@Test(description="Verfiy Login",priority = 1)//you have set priority as you are working on different test
		//if not set above priority ,it will throw an Error.....
		public void verifyLogin()
		{
			assertTrue(loginComponent.verfiyLoginFunc(), "Verify the Login..."); //loginComponent :object name
		
		}
		
		
		

		
	}

