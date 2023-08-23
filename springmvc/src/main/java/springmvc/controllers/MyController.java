package springmvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Sagar");
		modelAndView.setViewName("home");
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping(path = "/handleForm",method = RequestMethod.POST)
	public String formController() {
		return "Form submitted";
	}
}
