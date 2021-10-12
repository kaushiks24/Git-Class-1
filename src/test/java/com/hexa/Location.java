package com.hexa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Location extends BaseClass{

	public Location()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="location")
	private WebElement location;
	@FindBy(name="hotels")
	private WebElement hotel;
	@FindBy(name="room_type")
	private WebElement room;
	@FindBy(name="room_nos")
	private WebElement roomno;
	@FindBy(name="datepick_in")
	private WebElement datepck;
	@FindBy(name="datepick_out")
	private WebElement dateout;
	@FindBy(name="adult_room")
	private WebElement adult;
	@FindBy(name="child_room")
	private WebElement child;
	@FindBy(name="Submit")
	private WebElement search;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getRoomno() {
		return roomno;
	}
	public WebElement getDatepck() {
		return datepck;
	}
	public WebElement getDateout() {
		return dateout;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSearch() {
		return search;
	}
	
	
}
