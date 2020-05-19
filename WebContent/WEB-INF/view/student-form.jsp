<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
		<title>Student Registration form</title>
</head>
		
<body>

	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName"/>
	
	<br><br>
	
	Last Name: <form:input path="LastName"/>
	
	<br><br>
	
	Country:
	<form:select path="country">
	
	<form:options items="${student.countryOptions}"/>
	
	</form:select>
	
	<br><br>
	
	Favourite Language:
	Java   <form:radiobutton path="favouriteLanguage" value="Java"/>
	Ruby   <form:radiobutton path="favouriteLanguage" value="Ruby"/>
	C++    <form:radiobutton path="favouriteLanguage" value="C++"/>
	Python <form:radiobutton path="favouriteLanguage" value="Python"/>
	Perl   <form:radiobutton path="favouriteLanguage" value="Perl"/>

	
	<br><br>
	
	Operating System:
	
	Windows <form:checkbox path="operatingSystem" value="Windows"/>
	Linux   <form:checkbox path="operatingSystem" value="Linux"/>
	Mac 0S  <form:checkbox path="operatingSystem" value="Mac OS"/>
	
	
	
	
	<input type="Submit"  value="Submit"/>
	
	</form:form>
		
		
</body>


</html>
