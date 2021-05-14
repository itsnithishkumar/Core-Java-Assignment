package com.lambda3;

import java.util.function.Predicate;

public class PredicationJava {

	public static void main(String[] args) {
		Predicate<Integer> pr = a -> (a > 18);
        System.out.println(pr.test(18));

	}

}
