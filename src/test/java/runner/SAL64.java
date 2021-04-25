package runner;

import base.WrapperClass2;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/SAL64.feature",
glue = "step",
monochrome = true,
publish = true)

public class SAL64 extends WrapperClass2{

}
