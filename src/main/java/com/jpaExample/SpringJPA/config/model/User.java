package com.jpaExample.SpringJPA.config.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUser;
	
	@Column(name ="nome")
	private String name;
	@Column(name ="login")
	private String username;
	@Column(name ="senha")
	private String password;
	@Column(name= "dtcriado")
	private String log;
	
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [idUser=" + idUser + 
				", name=" + name + 
				", username=" + username + 
				", password=" + password
				+ ", log=" + log + "]";
	}
	
	public User(String name, String username, String password, String log) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.log = log;
	}
	
	

}
