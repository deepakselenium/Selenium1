package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import UI_Components.FlightFinderComponent;
import UI_Components.LoginComponent;

public class AbstractTest {
	
	LoginComponent loginComponent;
	
	//added latter******************
	FlightFinderComponent flightfindercomponet;

	WebDriver driver;
	
	
	AbstractTest()   //Constructor is called(to intialize the object)
	{
		loginComponent=new LoginComponent();
		
		//added latter******************************
		flightfindercomponet=new FlightFinderComponent();
		
	}
	
	@BeforeTest
	public void setupEnvironment()
	{
	     System.setProperty("webdriver.chrome.driver", "/Users/deepakkumarbehera/Tools/chromedriver");
	     driver = new ChromeDriver();
	     driver.get("http://newtours.demoaut.com/");
	     
	     //Added  PageFactory
	    PageFactory.initElements(driver, loginComponent);
	    PageFactory.initElements(driver, flightfindercomponet);
	    
	}
	
	@AfterTest
	public void closeEnvironment()
	{
		driver.close();
	}
}
