package com.zettamonk.cmd;

import java.util.Scanner;

public class AppointmentManager 
{
	private UndoableCommand command;
	private Appointment appointment; 
	
	public AppointmentManager(UndoableCommand newCommand)
	{
		command = newCommand;
	}
		
	public void setAppointment(Appointment newAppointment)
	{
		appointment = newAppointment;
	}
	
	public String getLocation()
	{
		System.out.println("Enter new location for appointment:");
		Scanner input = new Scanner(System.in);
		return input.next();
	}
}
