package com.example.TDDCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	public int calculate(String input) throws Exception {

		if (input.isEmpty() || input.isBlank()) {
			return 0;
		}

		String[] numbers = tokenize(input.strip());
		if (numbers.length == 1) {
			return Integer.parseInt(input.strip());
		} 
		else {
			return getSum(numbers);
		}

	}

	private int getSum(String[] numbers) throws Exception {
		int sum = 0;
		for (String strNum : numbers) {
			if(Integer.parseInt(strNum)> 0)
				sum += Integer.parseInt(strNum);
			else
				throw new Exception("Negative numbers are not allowed");
		}
		return sum;
	}

	private String[] tokenize(String input) {
		String defaultDelimeter = ",|\n";
		
		if(input.startsWith("//")) {
			Matcher m = Pattern.compile("//(.*)\n(.*)").matcher(input);
			m.matches();
			String customDelimeter = m.group(1);
			//System.out.println(customDelimeter);
			String numbers = m.group(2);
			//System.out.println(numbers);
			// Following line is written so that it supports custom as well default delimeter ","
			// as we are already using newline deliemter in different context here
			String finalDelimeter = customDelimeter+"|,";
			return numbers.split(finalDelimeter);
		}
		else {
		String[] numbers = input.strip().split(defaultDelimeter);
		return numbers;
		}
	}

}
