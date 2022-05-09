package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Student;
import com.dao.StudentDao;

@Controller
public class ActioController {
	@Autowired
	StudentDao dao;
	@RequestMapping("/addStudent")
	public String addStu(Model m) //Model--> MVC -- Bean-- for data fetch and data pass 
	{
		m.addAttribute("command", new Student());
		return "addStudent";
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String save(@ModelAttribute("student")Student student)
	{
		int x=dao.insertData(student);
		if(x>0)
		{
			System.out.println("Inserted ");
		}
		else
		{
			System.out.println("Not Inserted");
		}
		
		return "redirect:/views";
	}
	@RequestMapping("/views")
	public String viewAll(Model m)
	{
		List<Student> list=dao.getAllStudent();
		m.addAttribute("list", list);
		for (Student student : list) {
			System.out.println(student.getSid()+" "+student.getSname()+" "+student.getCity()+" "+student.getDegree());
		}
		return "views";
	}
	@RequestMapping(value = "editstudent/{id}")
	public String editStu(@PathVariable int id,Model m)
	{
		Student stu=dao.getSt(id);
		m.addAttribute("stu", stu);
		return "editst";
	}
	@RequestMapping(value = "/editUp",method = RequestMethod.POST) 
	public String editup(@ModelAttribute("student")Student student)
	{
		int x=dao.updateStu(student);
		if(x>0)
		{
			System.out.println("Updated ");
		}
		else
		{
			System.out.println("Not Updated");
		}
		
		return "redirect:/views";
	}
	@RequestMapping(value = "/deletestudent/{id}")
	public String deleteSt(@PathVariable int id,Model m)
	{
		int x=dao.deleteStu(id);
		if(x>0)
		{
			System.out.println("Delete ");
		}
		else
		{
			System.out.println("Not Delete");
		}
		
		return "redirect:/views";
	}
	
}
