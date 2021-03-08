package com.devco.qa.travelocity.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.devco.qa.travelocity.models.SearchTravelModel;
import com.devco.qa.travelocity.questions.VerifyTravel;
import com.devco.qa.travelocity.tasks.AccessBtnFlights;
import com.devco.qa.travelocity.tasks.OpenTheBrowser;
import com.devco.qa.travelocity.tasks.SearchTravel;
import com.devco.qa.travelocity.tasks.SelectTravel;
import com.devco.qa.travelocity.tasks.WaitFor;
import com.devco.qa.travelocity.userinterfaces.HomePageUserInterfaces;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SearchTravelStepDefinition {
	
	@Managed(driver="chrome")
	private WebDriver herBrowser;
	
	private Actor naty = Actor.named("Naty");
	
	private HomePageUserInterfaces travelocityHomePage;
	
	@Before
	public void setUp() {
		naty.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^that Naty wants go to travelocity page$")
	public void thatNatyWantsGoToTravelocityPage() throws Exception {
	    naty.wasAbleTo(OpenTheBrowser.on(travelocityHomePage),
	    		AccessBtnFlights.with(),
	    		WaitFor.seconds(5));
	}

	@When("^she search a travel$")
	public void sheSearchATravel(List<SearchTravelModel> searchTravelModel) throws Exception {
	    naty.attemptsTo(SearchTravel.with(searchTravelModel.get(0)),
	    		SelectTravel.with());
	}

	@Then("^she should see the travel search results$")
	public void sheShouldSeeTheTravelSearchResults() throws Exception {
	    naty.should(seeThat(VerifyTravel.selected()));
	}

}
