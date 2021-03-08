package com.devco.qa.travelocity.tasks;


import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.devco.qa.travelocity.interactions.SelectDate;
import com.devco.qa.travelocity.models.SearchThingsToDoModel;
import com.devco.qa.travelocity.userinterfaces.SearchThingsToDoUserInterfaces;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class SearchThingsToDo implements Task{
	
	private SearchThingsToDoModel searchThingsToDoModel;

	public SearchThingsToDo(SearchThingsToDoModel searchThingsToDoModel) {
		this.searchThingsToDoModel = searchThingsToDoModel;
	}

	@Override
	@Step("{0} Search things to go in Cancun")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(SearchThingsToDoUserInterfaces.BTN_THINGS_TO_DO),
				
				Click.on(SearchThingsToDoUserInterfaces.FIELD_THINGS_TO_DO_IN),
				Click.on(SearchThingsToDoUserInterfaces.FIELD_GOING),
				Enter.theValue(searchThingsToDoModel.getIn()).into(SearchThingsToDoUserInterfaces.FIELD_GOING),
				WaitFor.seconds(5),
				Click.on(SearchThingsToDoUserInterfaces.FIELD_RESULT_GOING),
				WaitFor.seconds(5),
				
				Click.on(SearchThingsToDoUserInterfaces.BTN_FROM),
				SelectDate.intoCalendar(searchThingsToDoModel.getFrom()),
				WaitFor.seconds(5),
				Click.on(SearchThingsToDoUserInterfaces.BTN_FROM_DONE),
				WaitFor.seconds(5),
				
				Click.on(SearchThingsToDoUserInterfaces.BTN_TO),
				SelectDate.intoCalendar(searchThingsToDoModel.getTo()),
				WaitFor.seconds(8),
				Click.on(SearchThingsToDoUserInterfaces.BTN_TO_DONE),
				WaitFor.seconds(8),
				
				Click.on(SearchThingsToDoUserInterfaces.BTN_SEARH_THING_TO_DO),
				WaitFor.seconds(5)
				);
		
		Serenity.setSessionVariable("Top 10 things to do").to(SearchThingsToDoUserInterfaces.LABEL_THINGS_TO_DO.resolveFor(actor).getText());
		
	}

	public static SearchThingsToDo with(SearchThingsToDoModel searchThingsToDoModel) {

		return instrumented(SearchThingsToDo.class, searchThingsToDoModel);
	}

}
