package com.devco.qa.travelocity.models;

public class SearchTravelModel {
	
	private String from;
	private String to;
	private String departing;
	private String returning;
	
	public String getFrom() {
		return from;
	}
	
	public String getTo() {
		return to;
	}
	
	public String getDeparting() {
		return departing;
	}
	
	public String getReturning() {
		return returning;
	}

	public SearchTravelModel(String from, String to, String departing, String returning) {
		this.from = from;
		this.to = to;
		this.departing = departing;
		this.returning = returning;
	}
	
}
