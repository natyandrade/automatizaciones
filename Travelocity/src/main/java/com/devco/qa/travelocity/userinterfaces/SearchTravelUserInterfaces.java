package com.devco.qa.travelocity.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchTravelUserInterfaces extends PageObject{
	
	public static final Target BTN_FLIGHTS = Target.the("Button Flights").located(By.xpath("//*[@id=\"uitk-tabs-button-container\"]/li[2]/a"));
	public static final Target FIELD_FROM = Target.the("Target From").located(By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/button"));
	public static final Target FIELD_TO = Target.the("Target To").located(By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/button"));

}
