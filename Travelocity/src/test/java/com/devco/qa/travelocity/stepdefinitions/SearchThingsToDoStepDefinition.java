package com.devco.qa.travelocity.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.devco.qa.travelocity.models.SearchThingsToDoModel;
import com.devco.qa.travelocity.questions.ThingsToDoQuestion;
import com.devco.qa.travelocity.tasks.SearchThingsToDo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SearchThingsToDoStepDefinition {
	
	@Managed(driver="chrome")
	private WebDriver herBrowser;
	
	private Actor naty = Actor.named("Naty");
	
	
	@Before
	public void serUp() {
		naty.can(BrowseTheWeb.with(herBrowser));
	}
	
	@When("^search for things to do in a destination and dates$")
	public void searchForThingsToDoInADestinationAndDates(List<SearchThingsToDoModel> searchThingsToDoModel) throws Exception {
	    naty.attemptsTo(SearchThingsToDo.with(searchThingsToDoModel.get(0)));
	}

	@Then("^she should see the list of things to do top 10$")
	public void sheShouldSeeTheListOfThingsToDoTop10() throws Exception {
	    naty.should(seeThat(ThingsToDoQuestion.list()));
	}

}
