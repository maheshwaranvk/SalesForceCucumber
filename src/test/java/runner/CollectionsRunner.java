package runner;

import org.testng.annotations.DataProvider;

import base.WrapperClass2;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/Collections.feature",
glue = "step",
monochrome = true,
publish = true)

public class CollectionsRunner extends WrapperClass2{
	
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
	
}
