package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.foodwiring.FoodPanda;

//import com.example.constructor.Student;
//import com.example.training.Employee;


@SpringBootApplication
public class TrailOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TrailOneApplication.class, args);
	}
     
	@Autowired
	ApplicationContext context;
	FoodPanda fp;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Student student = context.getBean("student", Student.class);
		//System.out.println(student);
		//Employee employee = context.getBean("employee", Employee.class);
		//System.out.println(employee);
		
		//ShapeFactory shapeFactory = context.getBean("shapeFactory", ShapeFactory.class);
		//shapeFactory.printArea(10,20);
		FoodPanda fp = context.getBean(FoodPanda.class);
		System.out.println(fp.showMenu("Indian"));
	
	}
	
	
}
