package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"Stepdefinitions"},
monochrome=true,
plugin= {"pretty","html:target/samplereportforhtm"},

tags= {"@testcaseone"}

)

public class TestRunner {

}
