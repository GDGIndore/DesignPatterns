package com.zettamonk.stg;

import java.util.ArrayList;

public class RunPattern 
{
	public static void main(String[] as)
	{
		System.out.println("start");
		ContactList list = makeContactList();
		/*
		 * set summarizers and see behaviour
		 */
	
	}
	
	public static ContactList makeContactList()
	{
		ContactList list = new ContactList();
		
		list.addContact(new Contact("David", "St. Hubbins", "Lead Guitar", "The New Originals"));
		list.addContact(new Contact("Mick", "Shrimpton", "Drummer", "The New Originals"));
		list.addContact(new Contact("Nigel", "Tufnel", "Lead Guitar", "The New Originals"));
		list.addContact(new Contact("Derek", "Smalls", "Bass", "The New Originals"));
		list.addContact(new Contact("Viv", "Savage", "Keyboards", "The New Originals"));
		list.addContact(new Contact("Nick", "Shrimpton", "CEO", "Fishy Business, LTD"));
		list.addContact(new Contact("Nickolai", "Lobachevski", "Senior Packer", "Fishy Business, LTD"));
		list.addContact(new Contact("Alan", "Robertson", "Comptroller", "Universal Exports"));
		list.addContact(new Contact("William", "Telle", "President", "Universal Exports"));
		list.addContact(new Contact("Harvey", "Manfredjensenden", "Inspector", "Universal Imports"));
		list.addContact(new Contact("Deirdre", "Pine", "Chief Mechanic", "The Universal Joint"));
		list.addContact(new Contact("Martha", "Crump-Pinnett", "Lead Developer", "Avatar Inc."));
		list.addContact(new Contact("Bryan", "Basham", "CTO", "IOVA"));
		
		return list;
	} 
}
