package com.devco.qa.travelocity.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchTravelUserInterfaces extends PageObject{
	
	public static final Target BTN_FLIGHTS = Target.the("Button Flights").located(By.xpath("//*[@id=\"uitk-tabs-button-container\"]/li[2]/a"));
	
	public static final Target BTN_ONE_WAY = Target.the("Button One Way").located(By.xpath("//*[@id=\"uitk-tabs-button-container\"]/div[1]/li[2]/a/span"));
	
	public static final Target BTN_FROM = Target.the("Button From").located(By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/button"));
	public static final Target FIELD_FROM = Target.the("Target From").located(By.xpath("//*[@id=\"location-field-leg1-origin\"]"));
	public static final Target FIELD_FROM_RESULT = Target.the("Target From Result").located(By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div[2]/ul/li[1]/button/div/div[1]/span/strong"));
	
	public static final Target BTN_TO = Target.the("Button To").located(By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/button"));
	public static final Target FIELD_TO = Target.the("Target To").located(By.xpath("//*[@id=\"location-field-leg1-destination\"]"));
	public static final Target FIELD_TO_RESULT = Target.the("Target To Result").located(By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div[2]/ul/li[1]/button/div/div[1]/span/strong"));
	
	public static final Target BTN_DEPARTING = Target.the("Button Departing").located(By.xpath("//*[@id=\"d1-btn\"]"));
	public static final Target BTN_DONE_DEPARTING = Target.the("Button Done Departing").located(By.xpath("//*[@id=\"wizard-flight-tab-oneway\"]/div[2]/div[2]/div/div/div/div/div[2]/div/div[3]/button"));
	
	public static final Target BTN_RETURNING = Target.the("Button Returning").located(By.xpath("//*[@id=\"d2-btn\"]"));
	public static final Target BTN_DONE_RETURNING = Target.the("Button Done Returning").located(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[3]/button"));
	
	public static final Target BTN_SEARCH_TRAVEL = Target.the("Button Search Travel").located(By.xpath("//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button"));
	
	
	
	public static final Target CHK_TRAVEL_ONE = Target.the("Check Travel One").located(By.xpath("//*[@id=\"preferred-airline-CM\"]"));
	
	public static final Target BTN_SELECT_TRAVEL = Target.the("Button Select Travel").located(By.xpath("//*[@id=\"AQr3AQrhAXY1LXNvcy05ZmMxOTlkZjJkNDU0YjBhODVmNDJjMzU2YmQ5YWMzNS0yMS0xfjIuU35BUW9FQ0lIeEJCSUhDTlFFRUFjWUd5QUhJQUVnRENBTklBa29BbGdCY0FBfkFRcEVDaUFJdzVvQkVnTXhOakVZN0NBZzc4UUJLT0hnNXdFd3MtSG5BVGhMUUFCWUFRb2dDTU9hQVJJRE16VTFHT19FQVNDQ2JTaXg0LWNCTU5iazV3RTRTMEFCV0FFU0NnZ0JFQUVZQVNvQ1EwMFlBU0lFQ0FFUUFTZ0NLQU1vQkRBQxFSuB6F6xF8QCIBASoFEgMKATESJwoWCgoyMDIxLTAzLTIxEgNNREUaA0NVThIHEgVDT0FDSBoCEAEgARoOCAESChoGQgQKAkNNIgAgAQ==\"]/div/div/div/button"));
	
	public static final Target BTN_SELECT_THIS_FARE = Target.the("Button Select This Fare").located(By.xpath("//*[@id=\"basic-economy-tray-content-1\"]/div/div/div[1]/button"));
	
	
	
	public static final Target BTN_NO_THANKS = Target.the("Button No Thanks").located(By.xpath("//*[@id=\"forcedChoiceNoThanks\"]"));
	
	public static final Target LABEL_TRIP_SUMMARY = Target.the("Label Trip Summary").located(By.xpath("/html/body/main/div/div[2]/section[1]/div/h2"));
	
	
	
	
	

}
