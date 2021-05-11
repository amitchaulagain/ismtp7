package com.company.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

class LinkedHashSet1 {
    public static void main(String args[]) {
        //Creating HashSet and adding elements
        LinkedHashSet<String> set = new LinkedHashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add(null);
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println( set.contains("One"));
        System.out.println( set.contains("ddsd"));

    }
}