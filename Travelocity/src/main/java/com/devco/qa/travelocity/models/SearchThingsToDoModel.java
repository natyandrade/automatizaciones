package com.devco.qa.travelocity.models;

public class SearchThingsToDoModel {
	
	private String in;
	private String from;
	private String to;
	
	
	public String getIn() {
		return in;
	}
	
	public String getFrom() {
		return from;
	}
	
	public String getTo() {
		return to;
	}
	

	public SearchThingsToDoModel(String in, String from, String to) {
		this.in = in;
		this.from = from;
		this.to = to;
	}
}
