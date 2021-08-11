package com.day8.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
	
		HashSet hs = new HashSet();
        hs.add(1);
        hs.add(6);
        hs.add(2); 
        hs.add(11);
        hs.add(26);
        
        System.out.println("hashset"  +hs);
        
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(1);
        lhs.add(6);
        lhs.add(2); 
        lhs.add(11);
        lhs.add(26);
        
        System.out.println("Linkedhashset"  +lhs);
        
        
        TreeSet ts = new TreeSet();
        ts.add(1);
        ts.add(4);
        ts.add(5);
        ts.add(5);
        ts.add(6);
        ts.add(11);
        //ts.add("sachin");
        
        System.out.println("Treeset"  +ts);
        
        HashMap hs1 =new HashMap();
        
        hs1.put(1, "parul");
        hs1.put(2, "aayushi");
        hs1.put(3, "sonal");
        hs1.put(4, "aayush");
        System.out.println("Elements in Hashmap"+hs1);

        
        
 LinkedHashMap hs2 =new LinkedHashMap();
        
        hs2.put(1, "parul");
        hs2.put(2, "aayushi");
        hs2.put(3, "sonal");
        hs2.put(4, "aayu");
        hs2.put(3, "sonal");
        		
        System.out.println("Elements in Hashmap"+hs2);

        
TreeMap hs3 =new TreeMap();
        
        hs3.put(1, "parul");
        hs3.put(2, "aayushi");
        hs3.put(3, "sonal");
        hs3.put(4, "aayu");
        hs3.put(4, "aayu");
        System.out.println("Elements in Hashmap"+hs3);

        
        
	}

}
