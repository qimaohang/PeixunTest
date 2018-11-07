package com.hk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hk.bean.Student;
import com.hk.service.StudentService;

@Controller
@RequestMapping("stu")
public class StudentController {
	
//	自动注入service对象
	@Autowired
	private StudentService service;
	
	@RequestMapping("students.do")
	@ResponseBody
	public Object studentList() {
//		调用service对象的方法
		List<Student> list = service.findStudents();
//		返回JSON数据
		return list;
	}
}
