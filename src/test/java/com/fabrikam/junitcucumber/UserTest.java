package com.fabrikam.junitcucumber;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = {"classpath:user.feature"},
   plugin = {"pretty", "json:target/reports/json/calculator.json"}
)
public class UserTest {

}
