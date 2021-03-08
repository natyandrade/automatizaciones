package com.devco.qa.travelocity.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class BookHotelRoomUserInterfaces {
	
	public static final Target BTN_HOTELS = Target.the("Button Hotels").located(By.xpath("//*[@id=\"uitk-tabs-button-container\"]/li[1]/a"));
	
	public static final Target BTN_GOING_TO = Target.the("Button Going To").located(By.xpath("//button[@aria-label='Going to']"));
	
	public static final Target FIELD_DESTINATION = Target.the("Field Destination").located(By.xpath("//*[@id=\"location-field-destination\"]"));
	public static final Target LOCATION = Target.the("Location").located(By.xpath("//*[@id=\"location-field-destination-menu\"]/div[2]/ul/li[1]/button"));
	
	public static final Target BTN_CHECK_IN = Target.the("Button Check In").located(By.xpath("//*[@id=\"d1-btn\"]"));
	public static final Target BTN_DONE_CALENDAR_CHECK_IN = Target.the("Button Done Calendar Check In").located(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[3]/button"));
	
	public static final Target BTN_CHECK_OUT = Target.the("Button Check Out").located(By.xpath("//*[@id=\"d2-btn\"]"));
	public static final Target BTN_DONE_CALENDAR_CHECK_OUT = Target.the("Button Done Calendar Check Out").located(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[3]/button"));
	
	public static final Target BTN_SEARCH = Target.the("Button Search").located(By.xpath("//button[@data-testid='submit-button']"));
	
	public static final Target OPTION_HOTEL = Target.the("Option Hotel").located(By.xpath("//*[@id=\"app-layer-base\"]/div/div/div/div[1]/main/div[2]/div/div[2]/section[2]/ol/li/div/div/a"));
	
	public static final Target FIELD_SEARCH = Target.the("Field Search").located(By.xpath("//*[@id=\"app-layer-base\"]/div/div/div/div[1]/main/div[2]/div/div[1]/section/form/fieldset[1]/div/div[2]/div/div/div[1]/button"));
	public static final Target FIELD_SEARCH_TWO = Target.the("Field Search Two").located(By.xpath("//*[@id=\"app-layer-base\"]/div/div/div/div[1]/main/div[2]/div/div[1]/section/form/fieldset[1]/div/div[2]/div/div/div[2]/header/section/div/input"));
	public static final Target NAME_HOTEL = Target.the("Name Hotel").located(By.xpath("//*[@id=\"app-layer-base\"]/div/div/div/div[1]/main/div[2]/div/div[1]/section/form/fieldset[1]/div/div[2]/div/div/div[2]/ul/li[1]/button/div/div[2]"));
	public static final Target NAME_HOTEL_FINAL = Target.the("Name Hotel Final").located(By.xpath("//*[@id=\"trip-summary\"]/div/div[1]/div/figure/div/div/h3/span/span"));
	
	public static final Target TITLE_HOTEL = Target.the("Title Hotel").located(By.xpath("//h1[contains(@class,'uitk-type-display-700')]"));
	
	public static final Target BTN_RESERVE_ROOM = Target.the("Button Reserve Room").located(By.xpath("//button[contains(@data-stid,'sticky-button')]"));
	public static final Target BTN_RESERVE_ROOM_FIRST = Target.the("Button Reserve Room First").located(By.xpath("(//button[@data-stid='submit-hotel-reserve'])[2]"));

}
