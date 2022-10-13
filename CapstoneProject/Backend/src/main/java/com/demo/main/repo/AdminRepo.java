package com.demo.main.repo;

import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo {
	public int AdminLogin(String name , String passoword);
}
