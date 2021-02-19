package com.devco.qa.travelocity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.devco.qa.travelocity.models.CreateAccountModel;
import com.devco.qa.travelocity.userinterfaces.CreateAccountUserInterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class CreateAccount implements Task{
	
	private CreateAccountModel createAccountModel;

	public CreateAccount(CreateAccountModel createAccountModel) {
		this.createAccountModel = createAccountModel;
	}

	@Override
	@Step("{0} Data entry for account creation")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(createAccountModel.getFirstName()).into(CreateAccountUserInterfaces.FIRST_NAME));
		actor.attemptsTo(Enter.theValue(createAccountModel.getLastName()).into(CreateAccountUserInterfaces.LAST_NAME));
		actor.attemptsTo(Enter.theValue(createAccountModel.getEmail()).into(CreateAccountUserInterfaces.EMAIL));
		actor.attemptsTo(Enter.theValue(createAccountModel.getPassword()).into(CreateAccountUserInterfaces.PASSWORD));
		actor.attemptsTo(Enter.theValue(createAccountModel.getConfirmPassword()).into(CreateAccountUserInterfaces.CONFIRM_PASSWORD));
		
		actor.attemptsTo(Click.on(CreateAccountUserInterfaces.AGREE_TERMS));
		actor.attemptsTo(Click.on(CreateAccountUserInterfaces.BTN_CREATE_ACCOUNT));
		
	}

	public static CreateAccount in(CreateAccountModel createAccountModel) {
		
		return instrumented(CreateAccount.class, createAccountModel);
	}
	
	

}











