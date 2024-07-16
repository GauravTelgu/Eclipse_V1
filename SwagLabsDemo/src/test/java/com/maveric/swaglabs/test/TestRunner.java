package com.maveric.swaglabs.test;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = "com.maveric.swaglabs.stepdefs",
			 //plugin = {"pretty", "html:Reports/HtmlReports/SwagLabs-reports.html"})
			 //plugin = { "pretty", "json:Reports/JSONReports/SwagLabs-reports.json" })
			//plugin = { "pretty", "junit:Reports/JunitReports/Cucumber-reports.xml" })
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestRunner {

}
 