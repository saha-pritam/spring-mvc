package springmvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.User;

@Controller
public class MyController {
	
	@ModelAttribute
	public void commonData(Model m) {
		System.out.println("Adding common data");
		m.addAttribute("data1", "Hi I am common data 1");
		m.addAttribute("data2", "Hi I am common data 2");
	}
	
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Sagar");
		modelAndView.setViewName("home");
		return modelAndView;
	}
	
	@RequestMapping(path = "/handleForm",method = RequestMethod.POST)
	public String formController(@ModelAttribute User user) {
		System.out.println("User Name :- "+user.getUsername());
		System.out.println("User Email :- "+user.getUsermail());
		System.out.println("User Password :- "+user.getUserpassword());
		System.out.println("User Occupation :- "+user.getUseroccupation());
		System.out.println("News Letters :- "+user.getNewsletters());
		System.out.println("Agree term :- "+user.getAgreeterm());
		return "formresult";
	}
}
