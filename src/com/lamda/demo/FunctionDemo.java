/**
 * 
 */
package com.lamda.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lambda.Function;

/**
 * @author psha84
 *
 */
public class FunctionDemo {
	public static  <R, V> List<R> transform(List<V> list, Function<V, R> f) {
	    List<R> result = new ArrayList<R>();
	        for(V j: list){ 
	             result.add (f.apply(j));
	        } 
	    return result;
	} 


	public static void main(String... args) {

		Function<String, Integer> findLength = (String s) -> s.length();

		List<Integer> lst = transform (Arrays.asList("Vijay", "Vishal", "Vinay"), findLength);
		System.out.println(lst);


	}

}
