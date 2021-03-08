package com.devco.qa.travelocity.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchThingsToDoUserInterfaces extends PageObject{
	
	public static final Target BTN_THINGS_TO_DO = Target.the("Button Things To Do").located(By.xpath("//*[@id=\"uitk-tabs-button-container\"]/li[5]/a"));
	
	public static final Target FIELD_THINGS_TO_DO_IN = Target.the("Field Things To do In").located(By.xpath("//*[@id=\"location-field-location-menu\"]/div[1]/button"));
	public static final Target FIELD_GOING = Target.the("Field Going").located(By.xpath("//*[@id=\"location-field-location\"]"));
	public static final Target FIELD_RESULT_GOING = Target.the("Field Result Going").located(By.xpath("//*[@id=\"location-field-location-menu\"]/div[2]/ul/li[1]/button/div/div[2]"));
	
	public static final Target BTN_FROM = Target.the("Button From").located(By.xpath("//*[@id=\"d1-btn\"]"));
	public static final Target BTN_FROM_DONE = Target.the("Button From Done").located(By.xpath("//*[@id=\"wizard-lx-pwa-1\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[3]/button"));
	
	public static final Target BTN_TO = Target.the("Button To").located(By.xpath("//*[@id=\"d2-btn\"]"));
	public static final Target BTN_TO_DONE = Target.the("Button To Done").located(By.xpath("//*[@id=\"wizard-lx-pwa-1\"]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[3]/button"));
	
	public static final Target BTN_SEARH_THING_TO_DO = Target.the("Button Search Things To Do").located(By.xpath("//*[@id=\"wizard-lx-pwa-1\"]/div[2]/div[2]/button"));
	
	public static final Target LABEL_THINGS_TO_DO = Target.the("Label Things To Do").located(By.xpath("//*[@id=\"placeholder\"]/section[3]/div[1]/h2"));

}
