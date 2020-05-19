package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {          
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel)        //spring populates all the data in student object
	{												   
		//create the student object
		
		Student theStudent = new Student();
		
		// add the student object as a model
		
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm( @ModelAttribute("student")Student theStudent)
	{
		
		System.out.println("theStudent:" + theStudent.getFirstName() + " " + theStudent.getLastName());
		
		return "student-confirmation";	
	}
}
// Using form tag is much easier than using request.parameter
// everytime a parameter is entered. We created a class student with fields, firstname and lastname
