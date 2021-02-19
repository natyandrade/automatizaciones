package com.devco.qa.travelocity.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.devco.qa.travelocity.models.SignInModel;
import com.devco.qa.travelocity.questions.SignInQuestion;
import com.devco.qa.travelocity.tasks.AccessSignIn;
import com.devco.qa.travelocity.tasks.GoTo;
import com.devco.qa.travelocity.tasks.OpenTheBrowser;
import com.devco.qa.travelocity.tasks.SignIn;
import com.devco.qa.travelocity.userinterfaces.HomePageUserInterfaces;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class SignInStepDefinition {
	
	@Managed(driver="chrome")
	private WebDriver herBrowser;
	
	private Actor naty = Actor.named("Naty");
	
	private HomePageUserInterfaces travelocityHomePage;
	
	@Before
	public void setUp() {
		naty.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^that Naty wants into travelocity page home$")
	public void thatNatyWantsIntoTravelocityPageHome() throws Exception {
		naty.wasAbleTo(OpenTheBrowser.on(travelocityHomePage),
				GoTo.SignIn(),
				AccessSignIn.with());
	}

	@When("^she enter the correct credentials$")
	public void sheEnterTheCorrectCredentials(List<SignInModel> signInModel) throws Exception {
		naty.attemptsTo(SignIn.with(signInModel.get(0)));
	}

	@Then("^she should login in to travelocity home page$")
	public void sheShouldLoginInToTravelocityHomePage() throws Exception {
		naty.should(seeThat(SignInQuestion.Continue(), equalTo("Natali")));
	}
	
}
