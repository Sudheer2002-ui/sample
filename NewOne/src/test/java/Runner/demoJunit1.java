package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\\\test\\\\resources\\\\Feature",glue="StepDefination",plugin= {"junit:target/junitreport/report.xml"})
public class demoJunit1 {

}
