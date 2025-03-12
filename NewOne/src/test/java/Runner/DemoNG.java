package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Feature\\s.feature",
glue= {"StepDefination","Hooks"},
plugin={"pretty","html:target/cucumberReport/report.html"},monochrome=true)
public class DemoNG extends AbstractTestNGCucumberTests{
	
}
