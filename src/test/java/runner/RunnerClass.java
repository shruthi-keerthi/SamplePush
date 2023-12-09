package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feauture",
        glue = {"src/test/java/stepdef", "src/test/java/utility"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"}
)

public class RunnerClass {

}
