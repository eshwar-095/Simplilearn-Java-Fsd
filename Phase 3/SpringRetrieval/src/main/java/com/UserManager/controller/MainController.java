package com.UserManager.controller;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.UserManager.dao.StudentDao;
import com.UserManager.entity.StudentEntity;


@Controller
public class MainController {
	
 
	
	@Autowired
	StudentDao dao;

	
	@GetMapping("/listdetails")
	public String getAllStudent(ModelMap map) {
		
		
		List<StudentEntity> list= dao.getAllStudent();
		map.addAttribute("list", list);
		return "details";
		
	}
	
	@GetMapping("/GetById")
	public String getStudentById(HttpServletRequest request,HttpServletResponse response, ModelMap map) throws ServletException, IOException {
		
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		String id = request.getParameter("id");
		if(id.equals("")) {
			out.println("<h2 style='color:red;'>Invalid Input</h2>");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}else {
			int id1 = Integer.parseInt(id);
			StudentEntity entity=dao.getStudentById(id1);
			map.addAttribute("obj",entity);
			return "student";
		}
		return null;
	}

	@GetMapping("/editsave")
	public String updateInfo(HttpServletRequest request, ModelMap map) {
		StudentEntity obj = new StudentEntity();
		obj.setId(Integer.parseInt(request.getParameter("eid")));
		obj.setName(request.getParameter("ename"));
		obj.setEmail(request.getParameter("eemail"));
		obj.setPassword(request.getParameter("epassword"));
		dao.updateProduct(obj);
		map.addAttribute("info", obj);
		return "info";
	}
	
}
