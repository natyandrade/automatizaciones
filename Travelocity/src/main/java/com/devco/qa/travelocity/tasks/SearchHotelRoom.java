package com.devco.qa.travelocity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.devco.qa.travelocity.interactions.SelectDate;
import com.devco.qa.travelocity.models.BookHotelRoomModel;
import com.devco.qa.travelocity.userinterfaces.BookHotelRoomUserInterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class SearchHotelRoom implements Task{
	
	private BookHotelRoomModel bookHotelRoomModel;

	public SearchHotelRoom(BookHotelRoomModel bookHotelRoomModel) {
		this.bookHotelRoomModel = bookHotelRoomModel;
	}

	@Override
	@Step("{0} Search Hotel Room")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(BookHotelRoomUserInterfaces.BTN_GOING_TO),
				Enter.theValue(bookHotelRoomModel.getDestination()).into(BookHotelRoomUserInterfaces.FIELD_DESTINATION),
				Click.on(BookHotelRoomUserInterfaces.LOCATION),
				WaitFor.seconds(5),
				Click.on(BookHotelRoomUserInterfaces.BTN_CHECK_IN),
				SelectDate.intoCalendar(bookHotelRoomModel.getCheck_in()),
				WaitFor.seconds(5),
				Click.on(BookHotelRoomUserInterfaces.BTN_DONE_CALENDAR_CHECK_IN),
				WaitFor.seconds(5),
				Click.on(BookHotelRoomUserInterfaces.BTN_CHECK_OUT),
				SelectDate.intoCalendar(bookHotelRoomModel.getCheck_out()),
				WaitFor.seconds(10),
				Click.on(BookHotelRoomUserInterfaces.BTN_DONE_CALENDAR_CHECK_OUT),
				WaitFor.seconds(8),
				Click.on(BookHotelRoomUserInterfaces.BTN_SEARCH),
				WaitFor.seconds(10));
	}

	public static SearchHotelRoom with(BookHotelRoomModel bookHotelRoomModel) {
		
		return instrumented(SearchHotelRoom.class, bookHotelRoomModel);
	}

}
