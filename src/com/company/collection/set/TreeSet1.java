package com.company.collection.set;

import java.util.Iterator;

public class TreeSet1 {
    public static void main(String args[]) {
        //Creating HashSet and adding elements
        java.util.TreeSet<String> set = new java.util.TreeSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("1");
        set.add("100");
        set.add("A");
        set.add("z");

        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}