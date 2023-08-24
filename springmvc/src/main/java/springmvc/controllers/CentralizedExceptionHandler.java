package springmvc.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CentralizedExceptionHandler {
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
