package com.zettamonk.deco;

public class Task implements ProjectItem {
	private String name; 
	private String assignedTo;
	
	public Task(String name, String assignedTo)
	{
		this.name = name;
		this.assignedTo = assignedTo;
	}
	
	@Override
	public double getTimeRequired() {
		//calculate time required for this task
		return 0;
	}
	public String toString()
	{
		return this.name;
	}
	
}
