package com.maveric.project.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="com.maveric.project.stepdefs")

public class TestRunner {

	
}
