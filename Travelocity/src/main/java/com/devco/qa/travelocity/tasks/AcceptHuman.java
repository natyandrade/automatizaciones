package com.devco.qa.travelocity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.devco.qa.travelocity.userinterfaces.CreateAccountUserInterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AcceptHuman implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(CreateAccountUserInterfaces.AGREE_TERMS));
		
	}

	public static AcceptHuman with() {
		
		return instrumented(AcceptHuman.class);
	}
	
	

}
