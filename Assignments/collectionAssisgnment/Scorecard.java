package com.collectionAssisgnments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;



public class Scorecard {

	public static void main(String args[]) {
		
int TotalScore =0;	
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Rahul",35);
		hm.put("Dhoni",10);
		hm.put("Kohli",45);		
		hm.put("Rahane",20);
		hm.put("Rohit", 50);
				
		TreeMap<String,Integer> sorted = new TreeMap(hm);
		
		System.out.println("\nPlayers who batted");
		for (Map.Entry<String, Integer> entry : sorted.entrySet())
		{
			System.out.println(entry.getKey());
			
		}
		
		System.out.println("\nScores  by players");
		for (Map.Entry<String, Integer> entry : sorted.entrySet())
		{	
			TotalScore = TotalScore+entry.getValue();
			System.out.println( entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("\nTotalScore : "+TotalScore);
		
		System.out.print("\nHighest scorer : ");			
		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : sorted.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		    
		}
		System.out.println(maxEntry.getKey());
	
		System.out.println("Runs Scored by Dhoni : "+ sorted.get("Dhoni"));
		
		
		
	}
		
	/** ArrayList<Cricketer> cricketer = new ArrayList<Cricketer>();
		 cricketer .add(new Cricketer("Rahane", 30));
		 cricketer .add(new Cricketer("Kholi", 150));
		 cricketer .add(new Cricketer("Dhoni", 50));
		 cricketer .add(new Cricketer("Lokesh", 2));
		 cricketer .add(new Cricketer("Rahul", 30)); 
		
		
		 
		 System.out.println("Enter Run Scored");
		
		 for(Cricketer c :cricketer) {
				
				System.out.println( c.name +" "+ c.score );
			}
			
		 System.out.println("Players who batted");
		 
		 for(Cricketer c :cricketer) {
				
				System.out.println( c.name );
		
		 }
		 
		 System.out.println("Players by Score");
		
		 for(Cricketer c :cricketer) {
				
				System.out.println(c.name +"-"+ c.score );
			}
	    
	
	  **/
	
	
}
