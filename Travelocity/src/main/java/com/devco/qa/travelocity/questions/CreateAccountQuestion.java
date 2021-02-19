package com.devco.qa.travelocity.questions;

import com.devco.qa.travelocity.userinterfaces.SignInUserInterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

public class CreateAccountQuestion implements Question<String>{

	@Override
	@Step("{0} Question: The user created is Natali?")
	public String answeredBy(Actor actor) {
		
		return Text.of(SignInUserInterfaces.LABEL_USER).viewedBy(actor).asString();
	}

	public static CreateAccountQuestion Continue() {

		return new CreateAccountQuestion();
	}

}
