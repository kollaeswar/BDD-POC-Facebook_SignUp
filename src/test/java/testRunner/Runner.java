package testRunner;	
import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(
		features="src/test/java/Features",
		glue={"stepDefinitions"},
		monochrome = true,
		format = {"pretty","html:target/reports"}
		)
							
public class Runner 				
{		

}