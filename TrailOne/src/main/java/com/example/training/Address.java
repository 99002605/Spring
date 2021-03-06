package com.example.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	String city;
	String state;
	public String getCity() {
		return city;
	}
	
	@Value("${employee.address.city}")
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

	public String getState() {
		return state;
	}
	
	@Value("${employee.address.state}")
	public void setState(String state) {
		this.state = state;
	}

}
