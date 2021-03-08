package com.devco.qa.travelocity.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.devco.qa.travelocity.models.BookHotelRoomModel;
import com.devco.qa.travelocity.questions.VerifyRoomQuestion;
import com.devco.qa.travelocity.tasks.AccessBtnHotels;
import com.devco.qa.travelocity.tasks.OpenTheBrowser;
import com.devco.qa.travelocity.tasks.SearchHotelRoom;
import com.devco.qa.travelocity.tasks.SelectHotelRoom;
import com.devco.qa.travelocity.userinterfaces.HomePageUserInterfaces;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class BookHotelRoomStepDefinition {
	
	@Managed(driver="chrome")
	private WebDriver herBrowser;
	
	private Actor naty = Actor.named("Naty");
	
	private HomePageUserInterfaces travelocityHomePage;
	
	@Before
	public void setUp() {
		naty.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^that Naty wants into travelocity website$")
	public void thatNatyWantsIntoTravelocityWebsite() throws Exception {
	    naty.wasAbleTo(OpenTheBrowser.on(travelocityHomePage),
	    		AccessBtnHotels.with());
	}

	@When("^looking for a hotel with the following data$")
	public void lookingForAHotelWithTheFollowingData(List<BookHotelRoomModel> bookHotelRoomModel) throws Exception {
	    naty.attemptsTo(SearchHotelRoom.with(bookHotelRoomModel.get(0)));
	}

	@When("^book a hotel room$")
	public void bookAHotelRoom(List<BookHotelRoomModel> bookHotelRoomModel) throws Exception {
	    naty.attemptsTo(SelectHotelRoom.with(bookHotelRoomModel.get(0)));
	}

	@Then("^she should see the room was selected$")
	public void sheShouldSeeTheRoomWasSelected() throws Exception {
	    naty.should(seeThat(VerifyRoomQuestion.reserved()));
	}

}
