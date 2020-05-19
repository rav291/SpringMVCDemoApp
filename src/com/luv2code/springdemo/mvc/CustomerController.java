package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		theModel.addAttribute("customer",new Customer());
		
		return "customer-form";	
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer,
								BindingResult theBindingResult) //Binding data.
	{
		if(theBindingResult.hasErrors()) // Sends to customer form if it has any errors
			return "customer-form";
		else
		return "customer-confirmation";  // Sends to confirmaation page if 
										 // everything is alright.
	}
	
	@InitBinder  // Pre-processes all web requests coming to the controller
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	// StringTrimmerEditor is a class defined in Spring API, which removes whitespace
	// leading and trailing
	// True means, trim down to null, if its entirely whitespace
	
	
	
	
}
