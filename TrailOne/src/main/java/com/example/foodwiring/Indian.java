package com.example.foodwiring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Indian implements Menu {
	
	@Override
	public List<String> itemsAvailable(){
		return Arrays.asList("Idli","Dosa","Naan");
	}
}
