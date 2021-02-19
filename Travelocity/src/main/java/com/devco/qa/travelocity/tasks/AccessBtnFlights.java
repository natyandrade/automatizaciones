package com.devco.qa.travelocity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.devco.qa.travelocity.userinterfaces.SearchTravelUserInterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class AccessBtnFlights implements Task{

	@Override
	@Step("{0} Go to the option Fligths")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(SearchTravelUserInterfaces.BTN_FLIGHTS));
		
	}

	public static AccessBtnFlights with() {
		
		return instrumented(AccessBtnFlights.class);
	}
}
