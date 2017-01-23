package com.calculator.application.simplecalculator;

import com.calculator.application.modules.DivisionModule.DivisionOperation;
import com.calculator.application.modules.MultiplicationModule.MultiplicationOperation;
import com.calculator.application.modules.additionModule.AdditionOperation;
import com.subtraction.operation.SubtractionOperation;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SimpleCalculatorTest 
    extends TestCase
{
	// Mock Data
	double a=5;
	double b=10;
	
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
    public SimpleCalculatorTest( String testName )
    {
        super( testName );
        
    	//Initialize the calculator operational Modules
		additionOperation = new AdditionOperation();
		subtractionOperation = new SubtractionOperation();
		multiplicationOperation = new MultiplicationOperation();
		divisionOperation = new DivisionOperation();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SimpleCalculatorTest.class );
    }

    public void testApp()
    {
        assertEquals( additionOperation.addition(a, b), 15.0);
        assertEquals( subtractionOperation.subtract(a, b), 5.0);
        assertEquals( multiplicationOperation.multiple(a, b), 50.0);
        assertEquals( divisionOperation.divide(a, b), 2.0);

    }
}
