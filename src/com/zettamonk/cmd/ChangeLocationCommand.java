package com.zettamonk.cmd;

public class ChangeLocationCommand implements UndoableCommand
{
	String oldLocation;
	String newLocation;
	
	Appointment appointment;
	AppointmentManager appointmentManager;
	
	public void setAppointment(Appointment apt)
	{
		this.appointment = apt;
	}
	
	public void setAppointmentManager(AppointmentManager aptManager)
	{
		this.appointmentManager = aptManager;
	}
	
	@Override
	public void execute() 
	{
		oldLocation = appointment.getLocation();
		newLocation = appointmentManager.getLocation();
		this.appointment.setLocation(newLocation);
	}

	@Override
	public void undo() 
	{
		this.appointment.setLocation(this.oldLocation);
	}
}
