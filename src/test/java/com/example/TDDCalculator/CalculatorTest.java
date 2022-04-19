package com.example.TDDCalculator;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CalculatorTest {
	
	@Test
	public void emptyStringReturnsZero() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.calculate(""),0);
	}
	
	public static void main(String args[]) {
		CalculatorTest ctest = new CalculatorTest();
		ctest.emptyStringReturnsZero();
	}

}
