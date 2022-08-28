package com.demo.main;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserHandlingApplicationTests {

	@Autowired
	private UserService userService;
	
	@Test
	void contextLoads() {
	}

	
	@Test
	void testServiceCall() {
		Iterable<User> users = userService.GetAllUsers();
		Integer count = 0;
		
		for(@SuppressWarnings("unused") User u: users)
			count++;
		
		assertNotEquals(count, 0);
	}
	
	@Test
	void countUsers() {
		Iterable<User> users = userService.GetAllUsers();
		Integer count = 0;
		
		for(@SuppressWarnings("unused") User u: users)
			count++;
		
		assertEquals(count, 3);
	}
	
	@Test
	void checkAllUsers() {
		Iterable<User> users = userService.GetAllUsers();
		
		for(User u: users)
			assertNotNull(u);
	}

}
