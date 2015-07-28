package com.zettamonk.deco;

import java.util.ArrayList;

public class RunPattern 
{
	public static void main(String[] as)
	{
		Task task = new Task("Task1","John");
		System.out.println(task);

		TaskWithAttachment task2 = new TaskWithAttachment();
		task2.setTask(task);
		ArrayList<String> attachments = new ArrayList<String>(); 
		attachments.add("File1");
		attachments.add("File2");
		attachments.add("File3");
		task2.setAttachments(attachments);
		System.out.println(task2);
	}
}
