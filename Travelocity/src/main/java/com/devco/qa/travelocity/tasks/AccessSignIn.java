package com.devco.qa.travelocity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.devco.qa.travelocity.userinterfaces.SignInUserInterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class AccessSignIn implements Task{

	@Override
	@Step("{0} Press the button Sign In")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(SignInUserInterfaces.BTN_SIGN_IN));
		
	}

	public static AccessSignIn with() {
		
		return instrumented(AccessSignIn.class);
	}
}
