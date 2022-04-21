package com.example.TDDCalculator;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;
import org.junit.jupiter.api.Test;


class Calculator_test {

	
	private final Calculator calculator = new Calculator();;

	@Test
	public void emptyStringReturnsZero() {
		assertEquals(calculator.calculate(""),0);
	}
	@Test
	public void singleValueReturnsItself() {
		//Calculator calculator = new Calculator();
		assertEquals(calculator.calculate("6"),6);
	}
	@Test
	public void twoNumberCommaSeparatedReturnsSum() {
		assertEquals(calculator.calculate("5,6"),11);
	}
	

}
