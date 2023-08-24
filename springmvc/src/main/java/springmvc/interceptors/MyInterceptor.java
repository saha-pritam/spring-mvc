package springmvc.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String username=request.getParameter("username").toLowerCase();
		char c = username.charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			response.getWriter().print("<h1>Your request failed at preHandle as username starts with vowel.");
			System.out.println("Your request failed at preHandle");
			return false;
		}
		System.out.println("Your request passed at preHandle");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("Your request is at postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("Your request is at afterCompletion");
	}
	
}
