package runners;

import org.junit.runner.RunWith;

import core.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//https://testingneeds.wordpress.com/2015/09/15/junit-runner-with-cucumberoptions/
//, "html:target/Relatorios/" 
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features/", glue = { "steps", "core" }, tags = { "@teste" }, plugin = {
		"pretty"})
public class RunnerTest extends BaseTest {
	// , monochrome = true, snippets = SnippetType.CAMELCASE, dryRun = false,
	// strict = false

	// Neessário colocar o core no Glue para identificar o @After do cucumber
}