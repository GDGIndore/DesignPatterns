package com.zettamonk.single;

public class RunPattern 
{

	public static void main(String[] args) 
	{
		DBConnection connection = DBConnection.getInstance();
		System.out.println(connection);
		DBConnection connectionNew = DBConnection.getInstance();
		System.out.println(connectionNew);
	}

}
