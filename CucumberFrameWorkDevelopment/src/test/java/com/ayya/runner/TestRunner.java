package com.ayya.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"com.ayya.stepDefinitions"},
 monochrome=true,plugin= {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
public class TestRunner {

}
