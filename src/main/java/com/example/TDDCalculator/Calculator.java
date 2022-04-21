package com.example.TDDCalculator;

public class Calculator {
	
	private int getSum(String[] numbers) {
		int sum=0;
		for (String strNum :numbers) {
			sum += Integer.parseInt(strNum);
		}
		return sum;
	}
	
	public int calculate(String input) {
		String[] numbers = input.split(",");
		if(input.isEmpty()) {
			return 0;
		}
		if(input.strip().length() == 1) {
			return Integer.parseInt(input.strip());
		}
		else {
			return getSum(numbers);
		}
		
	}

}
