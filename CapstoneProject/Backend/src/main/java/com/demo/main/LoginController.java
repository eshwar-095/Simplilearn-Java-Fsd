package com.demo.main;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.service.LoginService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/user")
public class LoginController {
	@Autowired
	private LoginService service;
	
	@GetMapping("/{mobile}/{password}")
	public int UserLogin(@PathVariable("mobile")String mobile1,@PathVariable("password")String password1) {
		 int flag= service.LoginValidate(mobile1, password1);
		 if(flag==0) {
			 return 0;
		 }
		 return flag;
		 
	}

}
