package com.devco.qa.travelocity.questions;

import com.devco.qa.travelocity.userinterfaces.BookHotelRoomUserInterfaces;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class VerifyRoomQuestion implements Question<Boolean>{

	@Override
	@Step("{0} Question: Room Reserve?")
	public Boolean answeredBy(Actor actor) {
		
		if(BookHotelRoomUserInterfaces.NAME_HOTEL_FINAL.resolveFor(actor).getText().equals(Serenity.sessionVariableCalled("titleHotel")))
			return true;
		return false;
	}

	public static VerifyRoomQuestion reserved() {

		return new VerifyRoomQuestion();
	}

}
