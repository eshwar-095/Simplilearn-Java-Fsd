package com.demo.main.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.demo.main.dbutil.DBUtil;
import com.demo.main.repo.LoginRepo;

@Service
public class LoginService implements LoginRepo {

	Connection connection;
	int flag;
	public LoginService() throws SQLException {
		connection=DBUtil.getConnection();
	}
	
	@Override
	public int LoginValidate(String mobile, String password) {
		try {
			PreparedStatement statement=connection.prepareStatement("select * from user where mobile='"+mobile+"'");
			ResultSet rs= statement.executeQuery();
			
			while(rs.next()) {
				if(rs.getString(6).equals(mobile) && rs.getString(8).equals(password)) {
					flag = 1;
				}else {
					flag=0;
					System.out.println("Invalid Username or Password");
					System.out.println(flag);
				}
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return flag;
	
	}

}
