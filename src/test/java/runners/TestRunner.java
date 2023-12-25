package runners;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features",
            glue = {"src/test/java/stepDefinitions","src/test/java/utilities"},
            plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty"}
)
public class TestRunner {

}
