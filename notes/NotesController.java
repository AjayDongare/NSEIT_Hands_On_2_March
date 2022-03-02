package com.example.notes.notes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesController
{
	@PostMapping("/greet/{fname}/{lname}")
	public String greeting(@PathVariable("fname") String fname,
	@PathVariable("lname") String lname) {
	return "Hello ,"+fname+" "+lname+" "+"Welcome";
	}
	
	@GetMapping("/notes")
	public Notes showNotes() 
	{
		return new Notes(1001,"Java","Ajay","Java is OOPS");
	}
	
	@GetMapping("/all")
	public List<Notes> showAllNotes() 
	{
		List<Notes> notes = new ArrayList();
		notes.add(new Notes(1001,"Java","Ajay","Java is OOPS"));
		notes.add(new Notes(1002,"Oracle","Swapnil","RDBMS Package"));
		return notes;
	}
	
	@PostMapping("/add") 
	public Notes postData1(@RequestBody Notes notes)
	{
		notes.setAuthor("Sagar");
		return notes;
	}
	
	@PostMapping("/post1")
	public String postData1() 
	{
		return "Post1 Mapping is called";
	}

	@PostMapping("/post2")
	public String postData2() 
	{
		return "Post2 Mapping is called";
	}
	
	@DeleteMapping("/all")
	public String deleteData() 
	{
		return "Delete Mapping is called";
	}
	
	@PutMapping("/all")
	public String putData() 
	{
		return "Put Mapping is called";
	}
	
	@PutMapping("/post2")
	public String putPostData()
	{
		return "Put-post2 Mapping is called";
	}
}
