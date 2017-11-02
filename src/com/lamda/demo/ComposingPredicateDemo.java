package com.lamda.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ComposingPredicateDemo {
	public static <T> List <T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<T>();
        for(T i :list){
            if(p.test(i)){
                result.add(i);
            }
        }
        return result;
    }

public static void main(String...args){

    List<Ball> inventory = new ArrayList<>();
    inventory.addAll(Arrays.asList(new Ball(80,"blue"), new Ball(155, "green"), new Ball(120, "red")));

   
    inventory.add(1, new Ball(30, "green"));
    inventory.add(1, new Ball(20, "red"));
    
    Predicate<Ball> weightedBall = (b ->b.getWeight()>20);
    Predicate<Ball> redBall = (b ->"red".equals(b.getColor()));
    Predicate<Ball> greenBall = (b ->"green".equals(b.getColor()));
    //List<Ball> op = filter(inventory, weightedBall.and(redBall));
    List<Ball> op1 = filter(inventory, weightedBall.and(redBall).or(greenBall));
    System.out.println(op1);              
}


}
