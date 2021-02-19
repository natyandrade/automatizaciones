package com.devco.qa.travelocity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.devco.qa.travelocity.models.SignInModel;
import com.devco.qa.travelocity.userinterfaces.SignInUserInterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class SignIn implements Task{
	
	private SignInModel signInModel;

	public SignIn(SignInModel signInModel) {
		this.signInModel = signInModel;
	}

	@Override
	@Step("{0} Data entry for sign in")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(signInModel.getUser()).into(SignInUserInterfaces.USER));
		actor.attemptsTo(Enter.theValue(signInModel.getPassword()).into(SignInUserInterfaces.PASSWORD));
		actor.attemptsTo(WaitFor.seconds(5));
		actor.attemptsTo(Click.on(SignInUserInterfaces.BTN_SIGN_IN_ACCEPT));
		actor.attemptsTo(WaitFor.seconds(5));
	}

	public static SignIn with(SignInModel signInModel) {
		
		return instrumented(SignIn.class, signInModel);
	}
}
