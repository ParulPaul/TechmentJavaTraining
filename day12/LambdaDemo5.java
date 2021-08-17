package com.techment.day12.newfeature;

import java.util.ArrayList;

public class LambdaDemo5 {

	public static void main(String[] args) {
		

		ArrayList<String> names = new ArrayList<String>();
		
		names.add("dhoni");
		names.add("sachin");
		names.add("kumar");
		names.add("ravi");
		names.add("santosh");
		
		System.out.println(names);
		
		System.out.println("Names that conatins A:");
		
		names.stream().filter(s->s.contains("a")).forEach(s->System.out.println(s));
		
		System.out.println("Length :");
		names.stream().filter(x->x.length()>5).forEach(x->System.out.println(x));
		
	}

}
