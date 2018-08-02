package com.testDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.testDemo.pojo.JSONResult;

@Controller
@RequestMapping("err")
public class ErrorController {
	
	@RequestMapping("/error")
	public String error() {
		int a = 1/0;
		return "thymeleaf/error/err";
	}
	
	@RequestMapping("/ajaxerror")
	public String ajaxerror() {
		return "thymeleaf/error/ajaxerror";
	}
	
	@RequestMapping("/getAjaxerror")
	@ResponseBody
	public JSONResult getAjaxerror() {
		int a = 1 / 0;
		return JSONResult.ok();
	}
}
