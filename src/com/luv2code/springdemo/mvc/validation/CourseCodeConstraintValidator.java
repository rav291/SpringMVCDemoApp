package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String >{

	private String coursePrefix;
	
	public void initialize(CourseCode theCourseCode)
	{
		coursePrefix = theCourseCode.value();
		
	}
	
	
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorConstraint) {
		// TODO Auto-generated method stub
		
		boolean result;
		
		if(theCode != null)
		{
			result = theCode.startsWith(coursePrefix); 
		}
		
		else 
			result = true;
		
		// This method is used to create custom logic
		return result;	// You can decide which condition should be met for it to return true..
	}

}
