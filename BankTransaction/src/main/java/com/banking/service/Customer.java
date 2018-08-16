package com.banking.service;

import java.io.Serializable;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int accountNO;
	private String lastName;
	private String firstName;
	private int ssn;
	private String address;
	private String city;
	private String state;
	private int zipcode;

	public int getaccountNO() {
		return accountNO;
	}

	public void setaccountNo(int accountNo) {
		this.accountNO = accountNo;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getSSN() {
		return ssn;
	}

	public void setSSN(int ssn) {
		this.ssn = ssn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipcode;
	}

	public void setZipCode(int zipcode) {
		this.zipcode = zipcode;
	}
}
