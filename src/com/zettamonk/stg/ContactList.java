package com.zettamonk.stg;

import java.util.ArrayList;

public class ContactList 
{	
	private ArrayList<Contact> contacts = new ArrayList<Contact>(); 
	public void addContact(Contact element)
	{
		if (!contacts.contains(element))
		{
			contacts.add(element);
		}
	} 
	
	public String summarize()
	{
		StringBuffer buffer = new StringBuffer();
		
		//summarization logic here...
		
		return buffer.toString();
	}
}










/*
public class ContactList 
{	
	private ArrayList<Contact> contacts = new ArrayList<Contact>(); 
	private SummarizingStrategy summarizer; 
	public void addContact(Contact element)
	{
		if (!contacts.contains(element))
		{
			contacts.add(element);
		}
	} 
	
	
	public void setSummarizer(SummarizingStrategy newSummarizer)
	{ 
		summarizer = newSummarizer; 
	}
	
	public String summarize()
	{
		return summarizer.summarize(contacts);
	}
	
}
*/