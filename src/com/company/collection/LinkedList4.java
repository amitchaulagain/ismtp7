package com.company.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String args[]) {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Ravi");   //0
        ll.add("Vijay");   //1
        ll.add("Ajay");   // 2
        //Traversing the list of elements in reverse order
        Iterator i = ll.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }


        System.out.println("------Ascending order sorting-------");
        Collections.sort(ll);    // by default ascending order

        Iterator j = ll.iterator();
        while (j.hasNext()) {
            System.out.println(j.next());
        }



        System.out.println("------Descending order sorting-------");
        Collections.reverse(ll);

        Iterator k = ll.iterator();
        while (k.hasNext()) {
            System.out.println(k.next());
        }



        LinkedList<Integer> lli = new LinkedList<Integer>();
        lli.add(1);   //0
        lli.add(2);   //1
        lli.add(3);   // 2


        Iterator h = lli.iterator();
        while (h.hasNext()) {
            System.out.println(h.next());
        }

    }
}