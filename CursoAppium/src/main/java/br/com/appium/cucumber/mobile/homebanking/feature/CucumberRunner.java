package br.com.appium.cucumber.mobile.homebanking.feature;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	format = {"pretty", "html:target/cucumber"}, 
	features = {"./src/main/java/br/com/appium/cucumber/mobile/homebanking/feature/Login.feature"}		
)
public class CucumberRunner {
	
	
}
