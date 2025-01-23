package com.demo.usermodel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="role")
public class roles {
	@Id
	private Long id;
	private String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public roles(Long id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public roles() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
