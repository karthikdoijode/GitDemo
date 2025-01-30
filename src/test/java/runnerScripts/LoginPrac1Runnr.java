package runnerScripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features= {"src/test/java/features/LoginPrac1.feature"},glue= {"stepDefinitionsPrac"},plugin= {"pretty", "html:target/htmlreport.html"})
public class LoginPrac1Runnr extends AbstractTestNGCucumberTests {

}