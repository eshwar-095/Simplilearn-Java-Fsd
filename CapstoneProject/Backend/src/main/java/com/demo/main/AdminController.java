package com.demo.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.service.AdminService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AdminController {
	@Autowired
	private AdminService service;
	
	@GetMapping("/{name}/{password}")
	public int AdminLogin(@PathVariable("name")String name1,@PathVariable("password")String password1) {
		 int flag= service.AdminLogin(name1, password1);
		 if(flag==0) {
			 return 0;
		 }
		 return flag;
		 
	}
}
