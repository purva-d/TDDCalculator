package com.example.TDDCalculator;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;
import org.junit.jupiter.api.Test;


class Calculator_test {
	
	private final Calculator calculator = new Calculator();;

//	@Test
//	public void emptyStringReturnsZero() throws Exception{
//		assertEquals(calculator.calculate(""),0);
//	}
	
//	@Test
//	public void singleValueReturnsItself() throws Exception{
//		//Calculator calculator = new Calculator();
//		assertEquals(calculator.calculate("6"),6);
//	}
	
//	@Test
//	public void twoNumberCommaSeparatedReturnsSum() throws Exception {
//		assertEquals(calculator.calculate("5,6"),11);
//	}
	
//	@Test
//	public void fourNumbersCommaSeparatedReturnsSum() throws Exception{
//		assertEquals(calculator.calculate("8,2,5,6"),21);
//	}
	
//	@Test
//	public void twoNumberNewLineSeparatedReturnsSum() throws Exception{
//		assertEquals(calculator.calculate("8,12"),20);
//	}
	
//	@Test
//	public void fourNumberDelimetedReturnsSum() throws Exception{
//		assertEquals(calculator.calculate("5\n3,8\n12"),28);
//	}
	
	@Test
	public void customDelimeter() throws Exception {
		assertEquals(calculator.calculate("//;\n1;2;3;4" ),10);
	}
	
	@Test
	public void negativeInputThrowsException() throws Exception {
		calculator.calculate("-2,4" );
	}

}
