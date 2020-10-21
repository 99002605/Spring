package com.example.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	@Autowired
	@Qualifier("triangle")
	Shape shape;
	
	@Autowired
	@Qualifier("triangle")
	Shape nshape;

	public void printArea(int x ,int y) {
		// TODO Auto-generated method stub
		System.out.println("Printing Area:");
          shape.calculateArea(x, y);
          nshape.calculateArea(x, y);
	}

}
