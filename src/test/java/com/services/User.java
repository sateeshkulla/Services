package com.services;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

public class User {

	private String name;

	private int age;

	private String address;
	
	@JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)
	private final Date birthDate;
	
	public User(String name, int age, String address, final Date birthDate) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthDate() {
		return birthDate;
	}

}
