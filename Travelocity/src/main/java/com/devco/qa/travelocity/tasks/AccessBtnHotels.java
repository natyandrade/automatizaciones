package com.devco.qa.travelocity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.devco.qa.travelocity.userinterfaces.BookHotelRoomUserInterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class AccessBtnHotels implements Task{

	@Override
	@Step("{0} Go tp the option Hotels")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(BookHotelRoomUserInterfaces.BTN_HOTELS));
		
	}

	public static AccessBtnHotels with() {

		return instrumented(AccessBtnHotels.class);
	}

}
