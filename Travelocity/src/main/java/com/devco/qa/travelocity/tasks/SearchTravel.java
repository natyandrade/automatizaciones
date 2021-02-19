package com.devco.qa.travelocity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.devco.qa.travelocity.models.SearchTravelModel;
import com.devco.qa.travelocity.userinterfaces.SearchTravelUserInterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class SearchTravel implements Task{
	
	private SearchTravelModel searchTravelModel;

	public SearchTravel(SearchTravelModel searchTravelModel) {
		this.searchTravelModel = searchTravelModel;
	}

	@Override
	@Step("{0} Search Travel")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(searchTravelModel.getFrom()).into(SearchTravelUserInterfaces.FIELD_FROM));
		
	}

	public static SearchTravel with(SearchTravelModel searchTravelModel) {
		
		return instrumented(SearchTravel.class, searchTravelModel);
	}

}
