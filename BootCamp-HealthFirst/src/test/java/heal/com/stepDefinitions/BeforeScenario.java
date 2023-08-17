package heal.com.stepDefinitions;

import heal.com.utitlities.SetUpDrivers;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeScenario {

	@Before("@chrome")
	public void beforeChromeScenario(Scenario Bf_scenario)
	{
		System.out.println(" CHROME DRIVER INITIALIZATION ");
			try
			{
				SetUpDrivers.setUpChromeDriver();
				System.out.println(" Chrome Driver Initialization");
				System.out.println(Bf_scenario.getName());
			}
			catch(Exception e)
			{
				System.out.println(" Chrome Initalization Failed ");
			}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
