package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

        },
        features = {"src/test/resources/features"},
        glue = {"com.autoc0de.steps","com.autoc0de.hooks"},
        tags = "@regresion"
)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {

}



