package com.RestProject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restcontroller {
	
	@GetMapping("/rest")
	public String Display() {
		return "THIS IS MY API";
	}
	
	@GetMapping("/bean")
	public StudentBean getInformation() {
		
		return new StudentBean("aftab",107,88.8f);
	}
	
	
	@GetMapping("/beans")
	
	public List<StudentBean> getAllInfo() {
		List <StudentBean> student = new ArrayList();
		
		student.add(new StudentBean("AFTAB",107,88.8f));
		student.add(new StudentBean("navin",102,88.8f));
		student.add(new StudentBean("Sahil",89,60f));
		student.add(new StudentBean("SONU",99,88.8f));
		student.add(new StudentBean("Awesh",118,88.8f));
		
		return student;
			
	}
	
	@GetMapping("/student/{name}/{roll}/{marks}")
	
	public StudentBean getInfoPath(@PathVariable("name")String name,@PathVariable("roll")int roll,@PathVariable("marks")float marks) {
		return new StudentBean(name,roll,marks);
	}

}
