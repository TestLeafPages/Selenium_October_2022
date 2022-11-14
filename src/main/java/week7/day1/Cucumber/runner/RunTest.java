package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features"},
				 glue = {"steps","hooks"}, 
				 monochrome = true,
				 publish = true,
				 tags = "@Sanity and @Smoke")
public class RunTest extends AbstractTestNGCucumberTests{

}
