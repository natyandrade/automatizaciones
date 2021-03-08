package com.devco.qa.travelocity.questions;

import com.devco.qa.travelocity.userinterfaces.SearchThingsToDoUserInterfaces;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class ThingsToDoQuestion implements Question<Boolean>{

	@Override
	@Step("{0} Verify list 10 things to do in Cancun")
	public Boolean answeredBy(Actor actor) {
		
		if(SearchThingsToDoUserInterfaces.LABEL_THINGS_TO_DO.resolveFor(actor).getText().equals(Serenity.sessionVariableCalled("Top 10 things to do")))
			return true;
		return false;
	}

	public static ThingsToDoQuestion list() {
		
		return new ThingsToDoQuestion();
	}

}
