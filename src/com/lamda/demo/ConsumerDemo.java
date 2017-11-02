package com.lamda.demo;

import java.util.Arrays;
import java.util.List;

import com.lambda.Consumer;

public class ConsumerDemo {
	
	public static void printEach(List<Integer> list,Consumer<Integer> c) {
		
		for(Integer i: list) {
			c.accept(i);
		}
	}
	
	public static void main(String[] args) {
		Consumer<Integer> consumer=(Integer i) -> System.out.println(i*2);
		printEach(Arrays.asList(1,2,3,4,5), consumer);
	}

}
