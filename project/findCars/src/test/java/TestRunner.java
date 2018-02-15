import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features"
        ,tags={"@searchCarsInLondon"} //tag of the features to be executed/tested
        ,monochrome = true
        ,glue={"com.testing.search"}
        ,plugin = { "pretty", "html:target/html/", "json:target/reports.json" }
)

public class TestRunner {

    @BeforeClass
    public static void readAndSetProperties(){

        System.setProperty("browserName", "firefox"); //browser to be used by selenium
    }

}
