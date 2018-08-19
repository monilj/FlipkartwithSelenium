package myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        strict = false,
        features="src/test/resources/features",format = {"pretty",
        "json:target_json/cucumber.json",
        "junit:taget_junit/cucumber.xml"
},tags = "@flip",glue={"steps"})

public class fliprunner {
}
