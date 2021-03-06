package com.devco.qa.travelocity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.devco.qa.travelocity.userinterfaces.CreateAccountUserInterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class GoTo implements Task{

	@Override
	@Step("{0} Go to the option sign in")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(CreateAccountUserInterfaces.OPTION_SIGN_IN));
		
	}


	public static GoTo SignIn() {

		return instrumented(GoTo.class);
	}
}
