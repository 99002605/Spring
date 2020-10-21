package com.example.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {
	
	@Override
	public void calculateArea(int x,int y) {
		System.out.println("tri:"+ 0.5*x*y);
	}

}
