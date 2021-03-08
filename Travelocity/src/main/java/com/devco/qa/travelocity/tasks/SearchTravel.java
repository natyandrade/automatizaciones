package com.devco.qa.travelocity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.devco.qa.travelocity.interactions.SelectDate;
import com.devco.qa.travelocity.models.SearchTravelModel;
import com.devco.qa.travelocity.userinterfaces.SearchTravelUserInterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class SearchTravel implements Task{
	
	private SearchTravelModel searchTravelModel;

	public SearchTravel(SearchTravelModel searchTravelModel) {
		this.searchTravelModel = searchTravelModel;
	}

	@Override
	@Step("{0} Search Travel from Medellin to Cancun")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(SearchTravelUserInterfaces.BTN_ONE_WAY),
				Click.on(SearchTravelUserInterfaces.BTN_FROM),
				Enter.theValue(searchTravelModel.getFrom()).into(SearchTravelUserInterfaces.FIELD_FROM),
				Click.on(SearchTravelUserInterfaces.FIELD_FROM_RESULT),
				Click.on(SearchTravelUserInterfaces.BTN_TO),
				Click.on(SearchTravelUserInterfaces.FIELD_TO),
				Enter.theValue(searchTravelModel.getTo()).into(SearchTravelUserInterfaces.FIELD_TO),
				Click.on(SearchTravelUserInterfaces.FIELD_TO_RESULT),
				Click.on(SearchTravelUserInterfaces.BTN_DEPARTING),
				SelectDate.intoCalendar(searchTravelModel.getDeparting()),
				WaitFor.seconds(8),
				Click.on(SearchTravelUserInterfaces.BTN_DONE_DEPARTING),
				WaitFor.seconds(5),
				Click.on(SearchTravelUserInterfaces.BTN_SEARCH_TRAVEL),
				WaitFor.seconds(5));

		
	}

	public static SearchTravel with(SearchTravelModel searchTravelModel) {
		
		return instrumented(SearchTravel.class, searchTravelModel);
	}

}
