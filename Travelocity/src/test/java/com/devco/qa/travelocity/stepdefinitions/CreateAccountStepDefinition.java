package com.devco.qa.travelocity.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.devco.qa.travelocity.models.CreateAccountModel;
import com.devco.qa.travelocity.questions.CreateAccountQuestion;
import com.devco.qa.travelocity.tasks.AcceptHuman;
import com.devco.qa.travelocity.tasks.AdmitNotRobot;
import com.devco.qa.travelocity.tasks.CreateAccount;
import com.devco.qa.travelocity.tasks.GoTo;
import com.devco.qa.travelocity.tasks.OpenTheBrowser;
import com.devco.qa.travelocity.tasks.PayIn;
import com.devco.qa.travelocity.tasks.WaitFor;
import com.devco.qa.travelocity.userinterfaces.HomePageUserInterfaces;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CreateAccountStepDefinition {
	
	@Managed(driver="Chrome")
	private WebDriver herBrowser;
	
	private Actor naty = Actor.named("Naty");
	
	private HomePageUserInterfaces travelocityHomePage;
	
	@Before
	public void setUp() {
		naty.can(BrowseTheWeb.with(herBrowser));
	}
	
	
	@Given("^that Naty wants into travelocity page$")
	public void thatNatyWantsIntoTravelocityPage() throws Exception {
	    naty.wasAbleTo(OpenTheBrowser.on(travelocityHomePage),
	    		GoTo.SignIn(),
	    		PayIn.CreateAccount(),
	    		WaitFor.seconds(30));
	}

	@When("^she create an account with the correct data$")
	public void sheCreateAnAccountWithTheCorrectData(List<CreateAccountModel> createAccountModel) throws Exception {
		naty.attemptsTo(AdmitNotRobot.with(),
				AcceptHuman.with());
		naty.attemptsTo(CreateAccount.in(createAccountModel.get(0)));
	}

	@Then("^she should see her name on the front page$")
	public void sheShouldSeeHerNameOnTheFrontPage() throws Exception {
	    naty.should(seeThat(CreateAccountQuestion.Continue(), equalTo("Natali")));
	}
}











