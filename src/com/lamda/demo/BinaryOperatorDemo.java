/**
 * 
 */
package com.lamda.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/**
 * @author psha84
 *
 */
public class BinaryOperatorDemo {
	
	private static List<String> binaryOpDemo(BinaryOperator<String> binaryOpt,
			Map<String, String> map) {
		List<String> biList = new ArrayList<>();
		BiConsumer<String, String> biconsumer=(s1, s2) -> biList.add(binaryOpt.apply(s1, s2));
		map.forEach((s1, s2) -> biList.add(binaryOpt.apply(s1, s2)));
		return biList;
	}

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("X", "A");
		map.put("Y", "B");
		map.put("Z", "C");
		BinaryOperator<String> binaryoperator=(s1, s2) -> s1 + "-" + s2;
		//binaryOpDemo((s1, s2) -> s1 + "-" + s2, map).forEach(
			//	x -> System.out.println(x));
		Consumer<String> consumer=s -> System.out.println(s);
		binaryOpDemo(binaryoperator, map).forEach(consumer);
		
	}

}
