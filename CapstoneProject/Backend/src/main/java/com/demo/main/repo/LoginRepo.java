package com.demo.main.repo;

import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo {
	public int LoginValidate(String mobile , String passoword);

}
