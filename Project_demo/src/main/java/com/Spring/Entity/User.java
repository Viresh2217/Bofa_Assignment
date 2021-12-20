package com.Spring.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name =  "user_table")
public class User {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	
	@Column(name = "name")
	private String Name;
	private String mobile;
	private String email;
	private String password;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(Integer id, String name, String mobile, String email, String password) {
		super();
		this.id = id;
		Name = name;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + ", mobile=" + mobile + ", email=" + email + ", password="
				+ password + "]";
	}


	
	
	
}



