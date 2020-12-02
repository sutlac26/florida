package com.florida.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"com.florida.step_definitions"},
        plugin = {"pretty", "html:HTML-Reports"},
        monochrome = true,
        dryRun = false,
        tags = "@sutlac"

)


public class CukeRunners {


}
