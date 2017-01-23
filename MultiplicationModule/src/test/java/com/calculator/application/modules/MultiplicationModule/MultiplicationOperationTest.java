package com.calculator.application.modules.MultiplicationModule;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultiplicationOperationTest 
{
	// Mocking the input data for Testing purpose
	double a=2;
	double b=5;
	
	MultiplicationOperation multiplicationOperation = new MultiplicationOperation();
	
	@Test
	public void testAdditionOperation() {
		assertEquals(a*b, multiplicationOperation.multiple(a, b), 0.001);
	}

}
