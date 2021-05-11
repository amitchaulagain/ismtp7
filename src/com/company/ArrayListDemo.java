package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String args[]) {


        List<String> list1 = new ArrayList<>();


        list1.add("1.1");
        list1.add("ball");
        list1.add("cat");


        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Ravi");               //Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        list.add(2, "Hero");
        list.remove("Ravi");
        list.remove(2);
        list.addAll(0, list1);
        Object[] vals = list.toArray();

        String x = (String) vals[0];


        Double y= Double.parseDouble(x);







        System.out.println(" y  :" + y);




        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }

    /**
     *
     * @param value vlaue to be entered
     * @param name
     * @param x
     */

    public void doThis(String value,String name,String x) {

    }

}
