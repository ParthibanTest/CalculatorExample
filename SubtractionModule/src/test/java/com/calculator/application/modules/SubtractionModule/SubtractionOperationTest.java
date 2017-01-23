package com.calculator.application.modules.SubtractionModule;

import org.junit.Test;

import com.subtraction.operation.SubtractionOperation;

import static org.junit.Assert.assertEquals;

public class SubtractionOperationTest 
{
	// Mocking the input data for Testing purpose
	double a=2;
	double b=5;
	
	SubtractionOperation subtractionOperation = new SubtractionOperation();
	
	@Test
	public void testAdditionOperation() {
		assertEquals(b-a, subtractionOperation.subtract(a, b), 0.001);
	}

}
