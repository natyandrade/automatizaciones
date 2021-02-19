package com.devco.qa.travelocity.manual.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/feature/login_user_incorrect.feature",
		glue="com.devco.qa.travelocity.manual.stepdefinitions",
		tags="@manual",
		snippets=SnippetType.CAMELCASE)

public class LoginUserIncorrectRunner {

}
