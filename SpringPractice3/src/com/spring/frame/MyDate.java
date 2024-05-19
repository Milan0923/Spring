package com.spring.frame;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bd")
@Scope("prototype")
public class MyDate {

	int day;
	int month;
	int year;
	
	
	public MyDate() {
		super();
		day=02;
		month=01;
		year=2024;
		
	}

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}
