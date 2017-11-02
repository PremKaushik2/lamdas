package com.lamda.demo;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	
	public static String calc(BiFunction<Integer, Integer, String> bi,
			Integer x, Integer y) {
		return bi.apply(x, y);
	}

	public static void main(String[] args) {
		String result = calc((a, b) -> ": " + (a * b), 3, 5);

		System.out.println(result);

	}
}
