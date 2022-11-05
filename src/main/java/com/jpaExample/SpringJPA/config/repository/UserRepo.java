package com.jpaExample.SpringJPA.config.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpaExample.SpringJPA.config.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
