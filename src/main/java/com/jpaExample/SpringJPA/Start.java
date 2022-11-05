package com.jpaExample.SpringJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.jpaExample.SpringJPA.config.model.User;
import com.jpaExample.SpringJPA.config.repository.UserRepo;

public class Start implements CommandLineRunner{

	@Autowired
	private UserRepo repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new User("Bruno","BrunoUser","BrunoPassword"));
		
		for (User u: repository.findAll()) {
			System.out.println(u);
		}
	}
}
