package springmvc.controllers;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class SearchController {
	@RequestMapping("/searchPage")
	public String getsearchPageOne() {
		return "searchPage";
	}
	
	@RequestMapping(path = "/searchGoogle",method = RequestMethod.POST)
	public String searchGoogle(@RequestParam("searchtext") String searchText) {
		searchText = "redirect:https://www.google.co.in/search?q="+searchText;
		System.out.println("I am on searchGoogle with redirection link :- "+searchText);
		return searchText;
	}
	
	@RequestMapping(path = "/searchYoutube",method = RequestMethod.POST)
	public RedirectView searchYoutube(@RequestParam("searchtext") String searchText) {
		searchText = "https://www.youtube.com/results?search_query="+searchText;
		RedirectView redirectView = new RedirectView(searchText);		
		System.out.println("I am on searchYoutube with redirection link :- "+searchText);
		return redirectView;
	}
	
	@RequestMapping(path = "/searchWikipedia",method = RequestMethod.POST)
	public void searchWikipedia(@RequestParam("searchtext") String searchText, HttpServletResponse response) {
		searchText = "https://en.wikipedia.org/wiki/"+searchText;
		System.out.println("I am on searchWikipedia with redirection link :- "+searchText);
		try {
			response.sendRedirect(searchText);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
