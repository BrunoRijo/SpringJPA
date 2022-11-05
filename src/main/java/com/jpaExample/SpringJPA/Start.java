package com.jpaExample.SpringJPA;

import java.time.LocalDate;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpaExample.SpringJPA.config.model.User;
import com.jpaExample.SpringJPA.config.repository.UserRepo;

@Component
public class Start implements CommandLineRunner{

	@Autowired
	private UserRepo repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(	
				new User(
				"João"
				,"JoaoUser"
				,"JoaoPassword"
				, LocalDate.now().toString()
			));	
		
		for(User u : repository.findAll()) {
			System.out.println(u);
		}
		
	}
}
