package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/SAL67.feature",
glue = "step",
monochrome=true, 
publish = true)

public class SAL67Runner extends AbstractTestNGCucumberTests{

}
