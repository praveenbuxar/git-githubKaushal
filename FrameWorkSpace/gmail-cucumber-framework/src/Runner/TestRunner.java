package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@Cucumber.Options(features="gmail-feature",glue={"ScriptDefination"})
public class TestRunner {

}
