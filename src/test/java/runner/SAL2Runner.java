package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/SAL25.feature",glue="step",monochrome=true, publish = true)
public class SAL2Runner extends AbstractTestNGCucumberTests{

}
