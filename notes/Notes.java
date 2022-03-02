package com.example.notes.notes;

public class Notes 
{
		int pid;
	String title;
	String author;
	String description;
	
	public Notes()
	{	
	}
	public Notes(int pid, String title, String author, String description) 
	{
		super();
		this.pid=pid;
		this.title=title;
		this.author=author;
		this.description=description;
	}
	public int getPid()
	{
		return pid;
	}
	public void setPid(int pid) 
	{
		this.pid = pid;
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public String getAuthor() 
	{
		return author;
	}
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
}

