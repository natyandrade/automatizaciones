package com.devco.qa.travelocity.models;

public class SearchTravelModel {
	
	private String from;
	private String to;
	
	public String getFrom() {
		return from;
	}
	
	public String getTo() {
		return to;
	}

	public SearchTravelModel(String from, String to) {
		this.from = from;
		this.to = to;
	}
	
}
