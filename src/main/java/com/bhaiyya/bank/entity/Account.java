package com.bhaiyya.bank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long accnumber;
	private String name;
	private String email;
	private String  phone;
	private String balance;
	
	public Account() {
		super();
	}

	public Account(Long accnumber, String name, String email, String phone, String balance) {
		super();
		this.accnumber = accnumber;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.balance = balance;
	}

	public Long getAccnumber() {
		return accnumber;
	}

	public void setAccnumber(Long accnumber) {
		this.accnumber = accnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accnumber=" + accnumber + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", balance=" + balance + "]";
	}
	
	
}