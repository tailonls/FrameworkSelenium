package runners;

import org.junit.runner.RunWith;

import core.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//https://testingneeds.wordpress.com/2015/09/15/junit-runner-with-cucumberoptions/

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features/", glue = { "steps", "core" }, tags = { "@teste" }, plugin = {
		"pretty", "html:target/Relatorios/" })
public class RunnerTest extends BaseTest {
	// , monochrome = true, snippets = SnippetType.CAMELCASE, dryRun = false,
	// strict = false

	// Neessário colocar o core no Glue para identificar o @After do cucumber

	/*
	 * Plugin: plugin Option is used to specify different formatting options for
	 * the output reports. Various options that can be used as for-matters are:
	 * Note – Format option is deprecated . Use Plugin in place of that.
	 * 
	 * A- Pretty: Prints the Gherkin source with additional colors and stack
	 * traces for errors.
	 * 
	 * B- HTML: This will generate a HTML report at the location mentioned in
	 * the for-matter itself. C- JSON: This report contains all the information
	 * from the gherkin source in JSON Format. This report is meant to be
	 * post-processed into another visual format by 3rd party tools such as
	 * Cucumber Jenkins.
	 * 
	 * D- JUnit: This report generates XML files just like Apache Ant’s JUnit
	 * report task. This XML format is understood by most Continuous Integration
	 * servers, who will use it to generate visual reports.
	 */
}