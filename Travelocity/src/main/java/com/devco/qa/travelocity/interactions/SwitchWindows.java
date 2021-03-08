package com.devco.qa.travelocity.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;


public class SwitchWindows implements Interaction{
	
	private final WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();

	@Override
	@Step("{0} Switch Windows with tab")
	public <T extends Actor> void performAs(T actor) {
		
		ArrayList<String> tab2 = new ArrayList<>(BrowseTheWeb.as(actor).getDriver().getWindowHandles());
		BrowseTheWeb.as(actor).getDriver().switchTo().window(tab2.get(0));
		BrowseTheWeb.as(actor).getDriver().switchTo().window(tab2.get(1));
		
	}

	public static SwitchWindows tab() {
		return instrumented(SwitchWindows.class);
	}
}
