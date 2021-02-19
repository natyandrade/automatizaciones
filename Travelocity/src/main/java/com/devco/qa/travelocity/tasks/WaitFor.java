package com.devco.qa.travelocity.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class WaitFor implements Task{
	
	private int seconds;
	
	public WaitFor(int seconds) {
		super();
		this.seconds = seconds;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Thread.sleep(this.seconds * 1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	public static WaitFor seconds(int seconds) {
		return instrumented(WaitFor.class, seconds);
	}
	

}
