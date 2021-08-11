package com.collection;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String args[]) {
		
		
		Stack stack = new Stack();
		stack.push(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		
		System.out.println("elements of stack " +stack);
		
		stack.pop();
		System.out.println("after removing" +stack);
		
		System.out.println("top element" +stack.peek());
		
		stack.pop();
		System.out.println("after removing" +stack);
	}

}
