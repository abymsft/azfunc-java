package com.fabrikam.junitcucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = {"src/test/java/com/fabrikam/junitcucumber/user.feature"},
   plugin = {"pretty", "json:target/reports/json/calculator.json"}
)
public class UserTest {

}
