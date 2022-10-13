package com.demo.main.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.demo.main.dbutil.DBUtil;
import com.demo.main.repo.AdminRepo;

@Service
public class AdminService implements AdminRepo{
	Connection connection;
	int flag;
	public AdminService() throws SQLException {
		connection=DBUtil.getConnection();
	}
	
	@Override
	public int AdminLogin(String name , String password) {
		try {
			PreparedStatement statement=connection.prepareStatement("select * from user where name='"+name+"'");
			ResultSet rs= statement.executeQuery();
			
			while(rs.next()) {
				if(rs.getString(7).equals("Admin12") && rs.getString(8).equals("admin@45")) {
					flag = 1;
				}else {
					flag=0;
					System.out.println("Invalid Admin or Password");
					System.out.println(flag);
				}
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return flag;
	
	}


}
