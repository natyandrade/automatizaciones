package com.devco.qa.travelocity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.devco.qa.travelocity.interactions.SwitchWindows;
import com.devco.qa.travelocity.models.BookHotelRoomModel;
import com.devco.qa.travelocity.userinterfaces.BookHotelRoomUserInterfaces;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SelectHotelRoom implements Task{
	
	private BookHotelRoomModel bookHotelRoomModel;

	public SelectHotelRoom(BookHotelRoomModel bookHotelRoomModel) {
		this.bookHotelRoomModel = bookHotelRoomModel;
	}

	@Override
	@Step("({0} Select Hotel Room)")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				WaitUntil.the(BookHotelRoomUserInterfaces.FIELD_SEARCH, isVisible()),
				WaitFor.seconds(5),
				Click.on(BookHotelRoomUserInterfaces.FIELD_SEARCH),
				WaitFor.seconds(5),
				WaitUntil.the(BookHotelRoomUserInterfaces.FIELD_SEARCH_TWO, isVisible()),
				Enter.theValue(bookHotelRoomModel.getNameHotel()).into(BookHotelRoomUserInterfaces.FIELD_SEARCH_TWO),
				WaitFor.seconds(5),
				Click.on(BookHotelRoomUserInterfaces.NAME_HOTEL),
				WaitUntil.the(BookHotelRoomUserInterfaces.OPTION_HOTEL, isVisible()),
				Click.on(BookHotelRoomUserInterfaces.OPTION_HOTEL),
				SwitchWindows.tab());

		Serenity.setSessionVariable("titleHotel").to(BookHotelRoomUserInterfaces.TITLE_HOTEL.resolveFor(actor).getText());
		
		actor.attemptsTo(
				Click.on(BookHotelRoomUserInterfaces.BTN_RESERVE_ROOM),
				WaitFor.seconds(5),
				WaitUntil.the(BookHotelRoomUserInterfaces.BTN_RESERVE_ROOM_FIRST, isEnabled()),
				Click.on(BookHotelRoomUserInterfaces.BTN_RESERVE_ROOM_FIRST));
	}

	public static SelectHotelRoom with(BookHotelRoomModel bookHotelRoomModel) {
		return instrumented(SelectHotelRoom.class, bookHotelRoomModel);
	}

}
