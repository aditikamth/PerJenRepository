package com.Calculator.CalculatorApp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
 
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalciTest 
{
	
	 private static CalciMain calculator;
	 
	    @BeforeClass
	    public static void initCalculator() {
	        calculator = new CalciMain();
	    }
	 
	    @Before
	    public void beforeEachTest() {
	        System.out.println("This is executed before each Test");
	    }
	 
	    @After
	    public void afterEachTest() {
	        System.out.println("This is exceuted after each Test");
	    }
	 
	    @Test
	    public void testSum() {
	        int result = CalciMain.sum(3, 4);
	 
	        assertEquals(7, result);
	    }
	    
	    @Test
	    public void testDivison() {
	         
	        int result = CalciMain.divide(10, 2);
	 
	        assertEquals(5, result);
	        } 
	    
	    @Test
	    public void testMultiply() {
	         
	        int result = CalciMain.multiply(5, 2);
	 
	        assertEquals(10, result);
	        } 
	    
	    @Ignore
	    @Test
	    public void testSubstraction() {
	        int result = 10 - 3;
	 
	        assertTrue(result == 9);
	    }
}
