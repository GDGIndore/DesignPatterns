package com.zettamonk.cmd;

import java.util.Date;
import java.util.Scanner;

public class RunPattern 
{
	public static void main (String args[])
	{
		int choice =0;
		System.out.println("Running appointment manager");
		System.out.println("Creating an Appointment for use in the demo"); 
		
		Appointment appointment = new Appointment("GDG Design Pattern Workshop" , "Indore" , new Date()); 
		
		
		ChangeLocationCommand changeLocationCommand = new ChangeLocationCommand();
		changeLocationCommand.setAppointment(appointment);
		
		AppointmentManager appointmentManager = new AppointmentManager(changeLocationCommand);
		appointmentManager.setAppointment(appointment);
		
		changeLocationCommand.setAppointmentManager(appointmentManager);
	
		
		do
		{
			System.out.println("Type \n 1 - update the location.\n 2 - undo the updation. \n 3 - quit the program.");
			Scanner input = new Scanner(System.in);
			choice = input.nextInt();
			switch (choice)
			{
				case 1:
					//appointment.setLocation("");
					changeLocationCommand.execute();
					break;
				case 2:
					//changeLocationCommand.undo();
					break;
					
				/*TODO implement redo and multi-undo*/
				
			}
			
			System.out.println(appointment);
		}while(choice!=3);
	}
}
