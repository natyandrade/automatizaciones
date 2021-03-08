package com.devco.qa.travelocity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.devco.qa.travelocity.userinterfaces.SearchTravelUserInterfaces;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class SelectTravel implements Task{

	@Override
	@Step("{0} Select travel or fligth")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				WaitFor.seconds(5),
				Click.on(SearchTravelUserInterfaces.CHK_TRAVEL_ONE),
				WaitFor.seconds(5),
				Click.on(SearchTravelUserInterfaces.BTN_SELECT_TRAVEL),
				Click.on(SearchTravelUserInterfaces.BTN_NO_THANKS));
				
				Serenity.setSessionVariable("Trip Summary").to(SearchTravelUserInterfaces.LABEL_TRIP_SUMMARY.resolveFor(actor).getText());
		
	}

	public static SelectTravel with() {

		return instrumented(SelectTravel.class);
	}


}
