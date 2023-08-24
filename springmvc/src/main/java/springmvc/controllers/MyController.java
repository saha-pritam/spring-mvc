package springmvc.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@RequestMapping("/")
	public String welcome() {
		System.out.println("welcome");
		return "index";
	}
	
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Sagar");
		modelAndView.setViewName("home");
		return modelAndView;
	}
	
	@RequestMapping(path = "/handleForm",method = RequestMethod.POST)
	public String formController(@ModelAttribute("user") User user, BindingResult result) {
		if(result.hasErrors())
			return "index";
		System.out.println("User Name :- "+user.getUsername());
		System.out.println("User Email :- "+user.getUsermail());
		System.out.println("User Password :- "+user.getUserpassword());
		System.out.println("User Occupation :- "+user.getUseroccupation());
		System.out.println("News Letters :- "+user.getNewsletters());
		System.out.println("Agree term :- "+user.getAgreeterm());
		return "formresult";
	}
	
	@RequestMapping("/exceptionOne")
	public String intentionalExceptionOne() {
		String s=null;
		s.length(); //This will lead to null pointer exception
		return "";
	}
	
	@RequestMapping("/exceptionTwo")
	public String intentionalExceptionTwo() {
		int x = 5/0; //This will lead to division by zero exception
		return "";
	}
	
	@RequestMapping("/exceptionThree")
	public String intentionalExceptionThree() {
		String s="pritam";
		s.charAt(10); //This will lead to index out of bounds exception
		return "";
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String generalizedExceptionExceptionHandler(Model model, Exception exception) {
		model.addAttribute("errorData",exception.getMessage());
		return "error";
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String nullPointerExceptionHandler(Model model,  Exception exception) {
		model.addAttribute("errorData",exception.getMessage());
		return "error";
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = ArithmeticException.class)
	public String arithmeticExceptionExceptionHandler(Model model,  Exception exception) {
		model.addAttribute("errorData",exception.getMessage());
		return "error";
	}
	
	
}
