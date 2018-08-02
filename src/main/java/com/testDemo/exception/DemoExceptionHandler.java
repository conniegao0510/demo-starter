package com.testDemo.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.testDemo.pojo.JSONResult;


@ControllerAdvice
public class DemoExceptionHandler {
	
	public static final String DEMO_ERROR_VIEW = "thymeleaf/error/err";

//	@ExceptionHandler(value = Exception.class)
//	public Object errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {
//		
//		e.printStackTrace();
//		
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("exception", e);
//		mav.addObject("url", request.getRequestURL());
//		mav.setViewName(DEMO_ERROR_VIEW);
//		return mav;
//	}
	
	@ExceptionHandler(value = Exception.class)
	public Object errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {
		
		e.printStackTrace();
		if(isAjax(request)) {
			return JSONResult.errorException(e.getMessage());
		} else {
			ModelAndView mav = new ModelAndView();
			mav.addObject("exception", e);
			mav.addObject("url", request.getRequestURL());
			mav.setViewName(DEMO_ERROR_VIEW);
			return mav;
		}
	}

	
	/**
	 * confirm request type is ajax or not
	 * @param request
	 * @return
	 */
	private boolean isAjax(HttpServletRequest request) {
		
		return (request.getHeader("x-requested-with") != null    
			    && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) ;
	}
}
