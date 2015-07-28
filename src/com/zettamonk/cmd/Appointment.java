package com.zettamonk.cmd;

import java.util.Date;

public class Appointment 
{
	private String title;
	private String location;
	private Date apppointmentDate;
	
	public Appointment(String title, String location, Date appDate)
	{
		this.title = title;
		this.location = location;
		this.apppointmentDate = appDate;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	public String getLocation()
	{
		return this.location;
	}
	
	public String toString()
	{
		return "Appointment=> Title - "+this.title +" || Date - "+this.apppointmentDate +" || Location - "+this.location +"\n" ;
	}
}
