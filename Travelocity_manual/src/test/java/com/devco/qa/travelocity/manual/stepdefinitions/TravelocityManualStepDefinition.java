package com.devco.qa.travelocity.manual.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import static com.devco.qa.travelocity.manual.lib.ManualTest.validate;

public class TravelocityManualStepDefinition {
	
	private Scenario scenario;
	
	@Before
	public void getScenario(Scenario scenario) {this.scenario = scenario;}
	
	@Given("^(.*)$")
	public void process(String step) { validate(step, scenario.getName());}
	
}
