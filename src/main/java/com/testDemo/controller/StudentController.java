package com.testDemo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.testDemo.pojo.JSONResult;
import com.testDemo.pojo.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/search")
	//@ResponseBody
	public Student search() throws ParseException {
		
		Student s = new Student();
		s.setDob(new SimpleDateFormat("yyyymmdd").parse("20080510"));
		s.setLastfirst("connie");
		s.setStudent_number(612345);
		s.setPassword("searchPass");
		s.setDesc("not nullXXXX....cccc");
		s.setCampusid(8);
		return s;
	}
	
	
	@RequestMapping("/getStudent")
	//@ResponseBody
	public JSONResult getStudent() throws ParseException {
		
		Student s = new Student();
		s.setDob(new SimpleDateFormat("yyyymmdd").parse("20080510"));
		s.setLastfirst("connie");
		s.setStudent_number(612345);
		s.setPassword("getStpass");
		s.setCampusid(8);
		
		return JSONResult.ok(s);
	}
}
