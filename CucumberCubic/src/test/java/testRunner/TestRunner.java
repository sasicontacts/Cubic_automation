package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"}, 
monochrome=true,
tags= "@Smoke or @Demo",
plugin = {"json:target/cucumber.json"})
public class TestRunner {

}


