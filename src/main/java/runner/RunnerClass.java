package runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import util.Utils;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"de.monochromata.cucumber.report.PrettyReports:target/cucumber"},
        features = "src/main/cucumber/resource/PrimeiraFeature.feature",
        glue = {"steps"})

public class RunnerClass {
    @AfterClass
    public static void report(){
        Utils.openReport();

    }
}



