package springmvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	public String formController(@RequestParam("username")String username, @RequestParam("usermail") String usermail, @RequestParam("userpassword") String userpassword, 
			@RequestParam("useroccupation") String useroccupation, @RequestParam("newsletters") String newsletters, 
			@RequestParam("agreeterm") String agreeterm ) {
		System.out.println("User Name :- "+username);
		System.out.println("User Email :- "+usermail);
		System.out.println("User Password :- "+userpassword);
		System.out.println("User Occupation :- "+useroccupation);
		System.out.println("News Letters :- "+newsletters);
		System.out.println("Agree term :- "+agreeterm);
		return "Form submitted";
	}
}
