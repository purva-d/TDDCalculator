package com.example.TDDCalculator;

public class Calculator {
	
	public int calculate(String input) {
		String[] numbers = input.split(",");
		if(input.isEmpty()) {
			return 0;
		}
		if(input.strip().length() == 1) {
			return Integer.parseInt(input.strip());
		}
		else {
			return Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
		}
		
	}

}
