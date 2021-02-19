package com.devco.qa.travelocity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.devco.qa.travelocity.userinterfaces.CreateAccountUserInterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

public class AdmitNotRobot implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		BrowseTheWeb.as(actor).getDriver().switchTo().defaultContent();
		BrowseTheWeb.as(actor).getDriver().switchTo().frame("a-yzgzhgg9aamj");

		
		actor.attemptsTo(Click.on(CreateAccountUserInterfaces.OPTION_NOT_ROBOT));
		
	}

	public static AdmitNotRobot with() {
		
		return instrumented(AdmitNotRobot.class);
	}
	
	

}
