package com.devco.qa.travelocity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.devco.qa.travelocity.userinterfaces.CreateAccountUserInterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class PayIn implements Task{

	@Override
	@Step("{0} Pay in the option create account")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(CreateAccountUserInterfaces.OPTION_CREATE_ACCOUNT));
		
	}

	public static PayIn CreateAccount() {
		
		return instrumented(PayIn.class);
	}
}
