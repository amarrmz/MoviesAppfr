package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/features/Movies", glue = {"TestSteps/Movies"}, tags = "@detailsScreen",
        plugin = {"pretty", "json:cucumber_results/Movies_report.json", "html:cucumber_results/Movies_report.html"})

public class MoviesAppTests {

}
