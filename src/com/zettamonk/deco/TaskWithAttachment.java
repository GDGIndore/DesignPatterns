package com.zettamonk.deco;

import java.util.ArrayList;

public class TaskWithAttachment implements ProjectItem 
{
	private ProjectItem task;
	private ArrayList<String> attachments; 
	
	@Override
	public double getTimeRequired() 
	{
		return this.task.getTimeRequired();
	}

	public ProjectItem getTask() 
	{
		return task;
	}

	public void setTask(ProjectItem task) 
	{
		this.task = task;
	}

	public ArrayList<String> getAttachments() 
	{
		return attachments;
	}

	public void setAttachments(ArrayList<String> attachments) 
	{
		this.attachments = attachments;
	}
	
	public String toString()
	{
		return ""+this.task+" with attachments"+this.attachments;
	}

}
