package com.devco.qa.travelocity.questions;

import com.devco.qa.travelocity.userinterfaces.SearchTravelUserInterfaces;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class VerifyTravel implements Question<Boolean>{

	@Override
	@Step("{0} Question: Verify Travel selected")
	public Boolean answeredBy(Actor actor) {
		
		if(SearchTravelUserInterfaces.LABEL_TRIP_SUMMARY.resolveFor(actor).getText().equals(Serenity.sessionVariableCalled("Trip Summary")))
			return true;
		return false;
	}

	public static VerifyTravel selected() {
		return new VerifyTravel();
	}

}
