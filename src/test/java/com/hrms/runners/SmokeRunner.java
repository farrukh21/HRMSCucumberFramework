package com.hrms.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class SmokeRunner {
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/resources/features/AddEmployee.feature"
			,glue="com/hrms/steps"
			,dryRun=false
			,plugin= {"pretty", "html:target/html/cucumber-default-report", "json:target/cucumber.json", "rerun:target/failed.txt"}
			,monochrome=true
			,tags= {"@smoke"}
			//,name= "Invalid Login and message validation"
			//,strict=true
			)

public class RunnerClass {

}
}
