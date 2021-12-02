package com.telusko.demo1.controller;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.demo1.tell.Login;
@Controller
public class LoginController {
@RequestMapping(method=RequestMethod.GET,value="/home")
public String home() {
	return "home.jsp";
}
@ResponseBody
@PostMapping("/result.html" )
public ModelAndView submitForm(@Valid @ModelAttribute("login1") Login login1, BindingResult result ) {
	
	  if(result.hasErrors()) 
	  {
		  ModelAndView m1 = new ModelAndView("error");
		  m1.addObject("msg","Invalid");
		  return m1; 
	  }
	 
	
	ModelAndView m1 = new ModelAndView("success.jsp");
	m1.addObject("msg", "Valid ");
	return m1;
	
}
}