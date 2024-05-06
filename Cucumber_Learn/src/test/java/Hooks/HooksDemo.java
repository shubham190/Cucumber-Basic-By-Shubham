package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class HooksDemo {
	
	//@Before("@smoke")
	@Before(order=1)
	public void setup(Scenario sc)
	{
		System.out.println("Before method order 1");
		System.out.println(sc.getName());
	}
	
	/*@Before(order=2)
	public void setupBrowser()
	{
		System.out.println("Before method order2");
	}
	
	@BeforeStep
	public void screenshot()
	{
		System.out.println("Before every step");
	}
	
	@After(order=2)
	public void TearDown(Scenario sc)
	{
		System.out.println("After method order 2");
		System.out.println(sc.getName());
	}
	
	@After(order=3)
	public void TearDownBrowser()
	{
		System.out.println("After method order 3");
	}
	*/
	
	//@After("@regression")
	@After(order=1)
	public void TearDownConnection()
	{
		System.out.println("After method order 1");
	}
	
	/*@AfterStep
	public void afterstep()
   {		System.out.println("After every step");	}

    }
*/
}