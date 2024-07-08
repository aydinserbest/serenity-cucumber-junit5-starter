package org.starter;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.SNIPPET_TYPE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "starter") // no need unless works from command line
//@ConfigurationParameter(key = "cucumber.publish.enabled", value = "true")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME,
//        value = "io.cucumber.core.plugin.SerenityReporterParallel,pretty")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-reports.html")
@ConfigurationParameter(key = SNIPPET_TYPE_PROPERTY_NAME, value = "camelcase") // Snippet tipi CamelCase olarak ayarlanır
// @ConfigurationParameter(key = SNIPPET_TYPE_PROPERTY_NAME, value = "underscore") // Snippet tipi Underscore olarak ayarlanır

public class AcceptanceTestSuite {
}
