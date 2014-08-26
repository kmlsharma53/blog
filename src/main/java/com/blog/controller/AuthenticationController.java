package com.blog.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blog.service.UserService;

@Controller
public class AuthenticationController {
	private static final  Logger logger = Logger.getLogger(AuthenticationController.class);
	@Autowired
	UserService userService;

	@RequestMapping(value="/createuser",method=RequestMethod.POST)
	public String createUser(HttpServletRequest request) {
		String user = request.getParameter("j_username");
		String password = request.getParameter("j_password");
		String email = request.getParameter("email");
		int sucess = userService.createUser(user, password, email);
		if(sucess == 1){
			return "success";
		}
		return "error";
	}
	
	@RequestMapping(value="/success",method=RequestMethod.GET)
	public String welcomeUser(ModelMap model, Principal principal) {
		logger.debug("tested");
		model.addAttribute("user", principal.getName());
		model.addAttribute("msg", "Welcome to Blog world");
		return "welcome";
	}
	
}
