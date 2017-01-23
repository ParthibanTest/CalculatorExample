package com.calculator.application.modules.additionModule;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdditionOperationTest 
{
	// Mocking the input data for Testing purpose
	double a=2;
	double b=2;
	
	AdditionOperation additionOperation = new AdditionOperation();
	
	@Test
	public void testAdditionOperation() {
		assertEquals(a+b, additionOperation.addition(a, b), 0.001);
	}

}
