package com.techment.Entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyTesting {

	
	Calculation calculation = new Calculation();
	
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
	
	@AfterEach
	void test12()
	{
	
		assertTrue(true);
		System.out.println("after each");
	}
	@Test
	void test() {
	//excepted value =6
		assertEquals(5, calculation.add(2, 4));
		System.out.println("test");
	}

	@Test
	void test2() {
		
		assertNotEquals(6, calculation.add(2, 4));
		System.out.println("test2");
	}
	
	@Test
	void test3()
	{
		assertEquals("eligible", calculation.checkEligibilty(17));
		System.out.println("test3");
	}

	@Test
	void test4() 
	
		{
	 
		assertTrue(calculation.name.contains("d"));
		System.out.println("test4");
	
	}
	
	void test5() {
		assertFalse(calculation.name.contains("a"));
	}
	
	@Test
	void test6() {
		
		assertThrows(ArithmeticException.class, ()->{ int a=1; int b=0; System.out.println(a/b);});
		
	}
	
	@Test
	void test7() {
		
		assertThrows(IllegalArgumentException.class, ()->{Integer.parseInt("1");});
	}
	
	@Test
	void test8() {
		
		assertThrows(IllegalArgumentException.class, ()->{Integer.parseInt("a");});
	}
}
