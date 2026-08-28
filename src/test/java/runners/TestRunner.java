package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"steps"},
    plugin = {
        "pretty",                              // readable console output
        "html:target/cucumber-reports.html",   // HTML report
        "json:target/cucumber.json"            // JSON for CI integration
    },
    monochrome = true,                         // cleaner console output
    publish = false
)
public class TestRunner {
    // Entry point — run this class to execute all scenarios
}
