package com.day8.collections;

import java.util.HashMap;
import java.util.Map.Entry;

import j

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("sachin", "sachin is a batsman \n");
		hm.put("dravid", "dravid is wicket keeper");
		hm.put("dhoni", "dhoni is a caption");
		
		
		System.out.println("hash hm"+hm);
		
		/**
		 * printing both key and value
		**/
		for(Entry<String, String> e :hm.entrySet()) 
		{
			
			System.out.println(e);
			System.out.println("key:"+e.getKey());
			System.out.println("values"+e.getValue());
			
		}
		
	}
	

}
