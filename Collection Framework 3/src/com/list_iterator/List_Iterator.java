package com.list_iterator;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator {
	
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(15,25,35,55,65,75);
		ListIterator<Integer> itr = list.listIterator(list.size());

		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
