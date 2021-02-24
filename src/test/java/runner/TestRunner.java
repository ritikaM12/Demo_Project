package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"src/test/java/resources"},
        glue = {"stepDef"},
        plugin = {"pretty","html:report","json:report//cucumber.json","junit:report//cucumber.xml"},
        dryRun =false,
        strict = true,
        monochrome =true         
        )

public class TestRunner {

}
