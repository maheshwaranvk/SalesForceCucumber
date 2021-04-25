package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/LoginPage.feature",glue="step",monochrome=true, publish = true)
public class SalesforceLogin extends AbstractTestNGCucumberTests{

}
