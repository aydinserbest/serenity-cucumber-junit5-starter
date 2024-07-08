package org.starter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        snippets = CucumberOptions.SnippetType.CAMELCASE
        //snippets = CucumberOptions.SnippetType.UNDERSCORE
)

public class AcceptanceTestSuite {
}
