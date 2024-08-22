package com.test;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@SelectPackages("com.test")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.test")
public class RunCucumberTest {
}