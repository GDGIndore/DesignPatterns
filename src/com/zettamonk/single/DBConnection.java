package com.zettamonk.single;

public class DBConnection 
{
	private static DBConnection instance;
	
	private DBConnection()
	{
		System.out.println("Creating instance...");
	}
	
	public static DBConnection getInstance()
	{
		System.out.println("called getInstance");
		if(instance==null)
		{
			System.out.println("creating singleton isntance");
			instance = new DBConnection();
		}
		System.out.println("returning singleton instance");
		return instance;
	}
}
