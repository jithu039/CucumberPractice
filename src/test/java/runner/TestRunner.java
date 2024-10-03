package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\jithe\\Downloads\\CucumberPractice2\\CucumberPractice2\\Resourses\\UserRegistration.feature",
		glue = "stepDefinitions",
		dryRun = false,
		monochrome = false,
		tags ="@Registration",
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
		)

public class TestRunner {

}
