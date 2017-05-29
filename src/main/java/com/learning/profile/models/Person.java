package com.learning.profile.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document
public class Person {
	@Id
	private String Id;
	private String firstname;
	private String lastname;
	private String email;
	private String phoneNumber;
	public String getEmail() {
		return email;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getId() {
		return Id;
	}
	public String getLastname() {
		return lastname;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setId(String id) {
		Id = id;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
