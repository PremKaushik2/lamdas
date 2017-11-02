package com.lamda.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.Comparator.comparing;
public class ComposeLambdasDemo {

	public static void main(String[] args) {
		List<Ball> inventory = new ArrayList<>();
        inventory.addAll(Arrays.asList(new Ball(80,"green"), new Ball(155, "green"), new Ball(120, "red")));
        inventory.add(1, new Ball(30, "green"));
        inventory.add(1, new Ball(20, "red"));        
        inventory.add(1, new Ball(10, "red"));     
        inventory.add(1, new Ball(10, "green"));
        inventory.add(1, new Ball(10, "blue"));
        // Here note that we have reversed the sorting using in built method
        inventory.sort(comparing(Ball::getWeight).reversed());
        inventory.sort(comparing(Ball::getWeight).reversed().thenComparing(Ball::getColor));
      //  inventory.sort(comparing(Ball::getWeight).reversed().thenComparing(b -> b.getColor()));
        System.out.println(inventory);       
        inventory.sort(comparing(Ball::getWeight).thenComparing(Ball::getColor));
        inventory.sort(comparing(Ball::getWeight).thenComparing(b -> b.getColor()));
        System.out.println(inventory);

	}

}
