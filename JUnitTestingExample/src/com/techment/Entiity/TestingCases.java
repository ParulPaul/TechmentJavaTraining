package com.techment.Entiity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/****
 *
   It is an open-source testing framework for java programmers. 
   The java programmer can create test cases and test his/her own code.
   It is one of the unit testing framework. Current version is junit 4.
   To perform unit testing, we need to create test cases. 
   The unit test case is a code which ensures that the program logic works as expected.
 * 
 * 
 * 
 * 
void assertEquals(boolean expected,boolean actual): checks that two primitives/objects are equal. It is overloaded.
void assertTrue(boolean condition): checks that a condition is true.
void assertFalse(boolean condition): checks that a condition is false.
void assertNull(Object obj): checks that object is null.
void assertNotNull(Object obj): checks that object is not null.
 * 
 * 
 */



public class TestingCases {

	//@BeforeClass annotation specifies that method will be invoked only once, before starting all the tests.
	@BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before-class");  
    }  
	
	//@Before annotation specifies that method will be invoked before each test.
    @Before  
    public void setUp() throws Exception {  
        System.out.println("before");  
    }  
    
    //@BeforeEach is used to signal that the annotated method should be executed before each @Test method in the current test class.
    @BeforeEach  
    public void setUpForEach() throws Exception {  
        System.out.println("before");  
    } 
  
    //@Test annotation specifies that method is the test method.
    @Test  
    public void testFindMax(){  
        System.out.println("test case find max");  
        assertEquals(5,Cal.findMax(new int[]{1,3,4,2,5}));
      
    }  
    
    @Test  
    public void testCube(){  
        System.out.println("test case cube");  
        assertEquals(27,Cal.cube(3));  
    }  
    
    @Test  
    public void testReverseWord(){  
        System.out.println("test case reverse word");  
        assertEquals("ym eman si nahk",Cal.reverseWord("my name is khan"));  
    } 
    
    //@After annotation specifies that method will be invoked after each test.
    @After  
    public void tearDown() throws Exception {  
        System.out.println("after");  
    }  
  
    //@AfterClass annotation specifies that method will be invoked only once, after finishing all the tests.
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class");  
    }  
  
}
