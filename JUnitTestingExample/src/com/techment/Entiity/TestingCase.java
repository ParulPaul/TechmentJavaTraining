package com.techment.Entiity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestingCase {
	
	@Before
	void test10()
	{
	
		assertTrue(true);
		System.out.println("before ");
	}
	

	@BeforeEach
	void test11()
	{
	
		assertTrue(true);
		System.out.println("before each");
	}	

	@Test
	void testFindMax() {
		    assertEquals(4,Cal.findMax(new int[]{1,3,4,2}));  
	    //    assertEquals(-1,Cal.findMax(new int[]{-12,-1,-3,-4,-2}));  
	}

}
