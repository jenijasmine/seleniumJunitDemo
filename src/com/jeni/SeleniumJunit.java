package com.jeni;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SeleniumJunit {
	
	int expectedValue, actualValue;
	
    public SeleniumJunit() {
    	expectedValue = 0;
    	actualValue = 0;
		
	}
    
    @BeforeAll
    public static void beforeAll() {
    	System.out.println("Before all tests....");
    }
    
    @AfterAll
    public static void afterAll() {
    	System.out.println("After all tests....");
    }
	
	@BeforeEach
	public void before() {
		System.out.println("Before test");
		expectedValue = 5;
		actualValue = 10;
	}
	
	@AfterEach
	public void after() {
		System.out.println("After test");
	}
	
	@Test
	public void firstTest() {
//		int expectedValue = 5;
//		int actualValue = 10;
		System.out.println("Running first Test");
		//assertEquals(expectedValue, actualValue);
		assertTrue(expectedValue < actualValue);
	}
	
	@Test
	public void secondTest() {
//		int expectedValue = 5;
//		int actualValue = 5;
		System.out.println("Running second Test");
		assertEquals(expectedValue, actualValue);
	}
	
	
}
