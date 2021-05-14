package com.company.spliterator;
import java.util.*;

public class SpliteratorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Spliterator<Integer> sit = list.spliterator();

        System.out.println("Number of elements need to be iterated: " + sit.estimateSize());

        Spliterator<Integer> sit1 = sit.trySplit();


        System.out.println("Number of elements need to be iterated: " + sit.estimateSize());
        System.out.println("Number of elements need to be iterated: " + sit1.estimateSize());

        System.out.println("First half elements: ");
        while(sit1.tryAdvance(System.out::println)){};
        // sit1.forEachRemaining(System.out::println);

        System.out.println("Last half elements: ");
        while(sit.tryAdvance(System.out::println));
        // sit1.forEachRemaining(System.out::println);

        System.out.println("Number of elements need to be iterated: " + sit.estimateSize());
        System.out.println("Number of elements need to be iterated: " + sit1.estimateSize());
    }
}
