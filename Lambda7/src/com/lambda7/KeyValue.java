package com.lambda7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KeyValue {

	public static void main(String[] args) {
		HashMap<String,String> s1=new HashMap<>();
		StringBuilder a1=new StringBuilder();
		
		 s1.put("Program", "Typing");
		 s1.put("Code", "Debugging");
		 s1.put("Error", "Check");
		 
		 
		 
		 Set<Entry<String, String>> s2=s1.entrySet();
		 System.out.println(s2);
		 
         Iterator<Entry<String, String>> n=s2.iterator();
         while(n.hasNext())
         {
        	 Map.Entry m1 =(Map.Entry)n.next();
             String x=(String) m1.getKey()+m1.getValue();
        	 a1.append(x);

         }
         
         System.out.println(a1);

	}

}
