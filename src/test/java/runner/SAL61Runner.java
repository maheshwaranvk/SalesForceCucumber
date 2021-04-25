package runner;

import base.WrapperClass2;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/SAL61.feature",
glue = "step",
monochrome = true,
publish = true)
public class SAL61Runner extends WrapperClass2 {

}
