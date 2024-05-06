package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\java\\Feature\\Order.feature"},
		glue= {"StepDefination"},
		plugin= {"pretty"},
		monochrome=true
		)
public class BackgroundRunner {
	
	

}
