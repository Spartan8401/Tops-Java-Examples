package com.collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s =new Stack();
		s.push(10);
		s.push("Piyush");
		s.push('t');
		s.push(null);
		s.push(10);
		s.push(75);
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
	}
	
	
	

}
