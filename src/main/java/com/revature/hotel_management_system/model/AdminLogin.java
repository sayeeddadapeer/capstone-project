package com.revature.hotel_management_system.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Admin_details")
public class AdminLogin {
	

	@Id
	private String emailId;
	private String password;
	private String name;
	private long mobile_number;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
	public AdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminLogin(String emailId, String password, String name, long mobile_number) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.name = name;
		this.mobile_number = mobile_number;
	}
	

}
