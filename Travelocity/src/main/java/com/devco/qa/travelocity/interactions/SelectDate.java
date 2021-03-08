package com.devco.qa.travelocity.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.devco.qa.travelocity.userinterfaces.BookHotelRoomUserInterfaces;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class SelectDate implements Interaction{
	
	private final WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
	private final String content;

	public SelectDate(String content) {
		this.content = content;
	}


	@Override
	@Step("{0} Select check in")
	public <T extends Actor> void performAs(T actor) {
		
		WebElement webElement = BrowseTheWeb.as(actor).find(By.xpath("//button[contains(@aria-label, '" + content + "')]"));
		webElement.click();
		
	}

	
	public static SelectDate intoCalendar(String content) {

		return instrumented(SelectDate.class, content);
	}
}
