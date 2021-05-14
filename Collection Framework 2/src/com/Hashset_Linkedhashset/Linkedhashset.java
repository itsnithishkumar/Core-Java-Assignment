package com.Hashset_Linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet<Integer> a=new LinkedHashSet<Integer>();      
        a.add(27);      
        a.add(50);      
        a.add(30);     
        a.add(9);    
        a.add(80);    
        Iterator<Integer> i=a.iterator();     
        while(i.hasNext())    
        {    
        System.out.println(i.next());    
        }

	}

}
