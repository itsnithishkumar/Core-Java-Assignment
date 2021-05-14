package com.Hashset_Linkedhashset;

import java.util.HashSet;
import java.util.Iterator;


public class Hashset_sample {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<Integer>();    
        h.add(200);      
        h.add(50);      
        h.add(75);     
        h.add(86);    
        h.add(10);  
        Iterator<Integer> i=h.iterator();   
        while(i.hasNext())    
        {    
        System.out.println(i.next());    
        }

	}

}
