package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.JVMReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Automation/CucuTuzzut/Features/test.feature", 
glue ={"org.test", "hooks"}, dryRun=false,monochrome = true, tags ="@Sannity",
plugin= {"pretty",  "html:src/test/resources/reports/report.html", 
		"json:src/test/resources/reports/report.json", 
		"junit:src/test/resources/reports/output.xml"}


		
		)
public class TestRunner {
	
	@AfterClass()
	public static void report() {
		JVMReports.generateJVMReport("src/test/resources/reports/report.json");
	}

}
