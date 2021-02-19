package com.devco.qa.travelocity.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/create_account.feature",
		glue="com.devco.qa.travelocity.stepdefinitions",
		snippets= SnippetType.CAMELCASE)

public class CreateAccountRunner {

}
