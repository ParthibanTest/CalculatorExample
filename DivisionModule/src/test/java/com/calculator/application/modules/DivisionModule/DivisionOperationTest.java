package com.calculator.application.modules.DivisionModule;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DivisionOperationTest 
{
	// Mocking the input data for Testing purpose
	double a=2;
	double b=4;
	
	DivisionOperation divisionOperation = new DivisionOperation();
	
	@Test
	public void testAdditionOperation() {
		assertEquals(b/a, divisionOperation.divide(a, b), 0.001);
	}

}
