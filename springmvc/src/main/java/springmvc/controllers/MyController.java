package springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	
	@RequestMapping("/home")
	public String home(HttpServletRequest request) {
		request.setAttribute("name", "Pritam");
		return "home";
	}
}
