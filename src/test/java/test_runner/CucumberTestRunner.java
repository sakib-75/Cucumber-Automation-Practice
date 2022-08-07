package test_runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"step_definitions",},
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/", "rerun:target/failedrerun.txt"}
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
