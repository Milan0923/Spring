package com.spring.frame;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("resAdd")
@Scope("prototype")
public class Address {

	String Street;
	String city;
	String state;
	String country;
	int pinCode;
	
	
	public Address() {
		super();
		city="Pune";
		state="MH";
		country="India";
		pinCode=411057;
		
	}

	public Address(String street, String city, String state, String country, int pinCode) {
		super();
		Street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", pinCode=" + pinCode + "]";
	}

	
	
}
