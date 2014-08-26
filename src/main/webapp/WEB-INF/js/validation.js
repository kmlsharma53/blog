function validate()
	{
	
	var valid = true;
	
	if (document.userform.j_username.value.lenght < 5 || document.userform.j_username.value.lenght > 10)
	{
	 alert ("The user name length can only be between 5 to 10"); 
     valid = false;   
	}
	if (document.userform.j_password.value.lenght < 8 || document.userform.j_password.value.lenght > 15)
	{
	 alert ("The password length can only be between 8 to 15"); 
     valid = false;   
	}
	return valid;
	}