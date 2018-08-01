package com.testDemo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testDemo.pojo.Student;

@Controller
@RequestMapping("th")
public class ThymeleafController {
	
	@RequestMapping("index")
	public String index(ModelMap map) {
		map.addAttribute("name", "thymeleaf-demo-starter");
		return "thymeleaf/index";
	}
	
	@RequestMapping("center")
	public String center() {
		return "thymeleaf/center/center";
	}
	
	@RequestMapping("auth")
	public String test(ModelMap map) throws ParseException {

		Student s = new Student();
		s.setLastfirst("connie gao");
		s.setGrade(2);
		s.setDob(new SimpleDateFormat("yyyymmdd").parse("20080510"));
		s.setDesc("<font color='green'><b>hello</b></font>");
		
		map.addAttribute("s", s);
		
		Student s1 = new Student();
		s1.setLastfirst("kiki zhang");
		s1.setGrade(12);
		s1.setDob(new SimpleDateFormat("yyyymmdd").parse("20080510"));
		s1.setDesc("<font color='green'><b>hello</b></font>");
		
		Student s2 = new Student();
		s2.setLastfirst("Levi Gao");
		s2.setGrade(12);
		s2.setDob(new SimpleDateFormat("yyyymmdd").parse("20080510"));
		s2.setDesc("<font color='green'><b>hello</b></font>");
		
		Student s3 = new Student();
		s3.setLastfirst("tony wang");
		s3.setGrade(12);
		s3.setDob(new SimpleDateFormat("yyyymmdd").parse("20080510"));
		s3.setDesc("<font color='green'><b>hello</b></font>");
		
		List<Student> sList = new ArrayList<>();
		sList.add(s);
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		map.addAttribute("sList", sList);
		
		return "thymeleaf/auth";
	}
	
	@RequestMapping("postform")
	public String postform(Student s) {
		System.out.println(s.getLastfirst());
		System.out.println(s.getGrade());
		return "redirect:/th/auth";
	}

}
