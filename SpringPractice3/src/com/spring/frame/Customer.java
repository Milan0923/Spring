package com.spring.frame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cust")
@Scope("prototype")
public class Customer {

	int custId;
	String custName;
	@Autowired
	Address resAddress;
	@Autowired
	MyDate birthDate;
	
	public Customer() {
		super();
		custId=154;
		custName="Ritik";;
	}
	public Customer(int custId, String custName, Address resAddress, MyDate birthDate) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.resAddress = resAddress;
		this.birthDate = birthDate;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Address getResAddress() {
		return resAddress;
	}
	public void setResAddress(Address resAddress) {
		this.resAddress = resAddress;
	}
	public MyDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", resAddress=" + resAddress + ", birthDate="
				+ birthDate + "]";
	}
}
