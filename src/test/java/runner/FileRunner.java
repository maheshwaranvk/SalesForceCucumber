package runner;

import base.WrapperClass2;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/feature/File.feature",
glue = "step",
monochrome = true,
publish = true)

public class FileRunner extends WrapperClass2{

}
