package com.devco.qa.travelocity.models;

public class BookHotelRoomModel {
	
	private String destination;
	private String check_in;
	private String check_out;
	private String nameHotel;
	
	public String getDestination() {
		return destination;
	}
	
	public String getCheck_in() {
		return check_in;
	}
	
	public String getCheck_out() {
		return check_out;
	}
	
	public String getNameHotel() {
		return nameHotel;
	}
	
	public BookHotelRoomModel(String destination, String check_in, String check_out, String nameHotel) {
		this.destination = destination;
		this.check_in = check_in;
		this.check_out = check_out;
		this.nameHotel = nameHotel;
	}
}
