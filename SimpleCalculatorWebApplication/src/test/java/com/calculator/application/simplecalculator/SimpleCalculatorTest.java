package com.calculator.application.simplecalculator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.application.modules.DivisionModule.DivisionOperation;
import com.calculator.application.modules.MultiplicationModule.MultiplicationOperation;
import com.calculator.application.modules.additionModule.AdditionOperation;
import com.subtraction.operation.SubtractionOperation;


public class SimpleCalculatorTest 
{
	// Mock Data
	double a=5;
	double b=10;
	double c=20;
	
	// Operational Modules
		AdditionOperation additionOperation;
		SubtractionOperation subtractionOperation;
		MultiplicationOperation multiplicationOperation;
		DivisionOperation divisionOperation;
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SimpleCalculatorTest()
    {
    	//Initialize the calculator operational Modules
		additionOperation = new AdditionOperation();
		subtractionOperation = new SubtractionOperation();
		multiplicationOperation = new MultiplicationOperation();
		divisionOperation = new DivisionOperation();
    }

    @Test
    public void testApp()
    {
    	double result = additionOperation.addition(subtractionOperation.subtract(b, c), multiplicationOperation.multiple(a, b));
        assertEquals( result, 60.0, 0.001);
        assertEquals( divisionOperation.divide(a, b), 2.0, 0.001);
    }
}
