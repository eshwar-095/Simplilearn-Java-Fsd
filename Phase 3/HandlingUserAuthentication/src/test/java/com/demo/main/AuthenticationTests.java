package com.demo.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;




@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AuthenticationTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    
    @Test
    public void returnUserFromName() {
        User testUser = new User();
        testUser.setName("XYZ");
        testUser.setEmail("abd17@yahoo.com");
        testUser.setPassword("AB7");
        entityManager.persist(testUser);
        entityManager.flush();

        User found = userRepository.findByName(testUser.getName());

        assertEquals(found.getName(), testUser.getName());
    }

    @Test
    public void passwordNotNull() {
    	
		Iterable<User> users = userRepository.findAll();
		for(User u: users)
			assertNotNull(u.getPassword());
    }

    @Test
    public void nameNotNull() {
    	
		Iterable<User> users = userRepository.findAll();
		for(User u: users)
			assertNotNull(u.getName());
    }

    @Test
    public void emailNotNull() {
    	
		Iterable<User> users = userRepository.findAll();
		for(User u: users)
			assertNotNull(u.getEmail());
    }


}

