package com.company.queue;

import com.company.Fruit;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        //Adding elements to map
        System.out.println(map.isEmpty());
        map.put(1, "Amit");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");


        Set<Map.Entry<Integer, String>> entries = map.entrySet();







        System.out.println(entries.size());

        for (Map.Entry<Integer, String> singleEntry : entries) {

            System.out.println("Key  :" + singleEntry.getKey() + "-----" + "Value  :" + singleEntry.getValue());

        }


        Fruit fruit1 = new Fruit("apple", 100);

        Fruit fruit2 = new Fruit("mango", 200);


        List<Fruit> fruits = new ArrayList<>();
        fruits.add(fruit1);
        fruits.add(fruit2);


        Map<String, Object> newMap = new HashMap<String, Object>();


        newMap.put("first", "apple");
        newMap.put("second", fruit1);
        newMap.put("third", fruits);
        newMap.put("third", "what ???????");


        Fruit ourFruit = (Fruit) newMap.get("second");


        System.out.println(newMap.get("first"));
        System.out.println("Name :" + ourFruit.getName() + "  Weight :" + ourFruit.getWeight());


        System.out.println("-----------------------------");


        List<Fruit> fs = (List<Fruit>) newMap.get("third");


        for (Fruit f : fs) {
            System.out.println("Name :" + f.getName() + "  Weight :" + f.getWeight());

        }


        Map<String, Integer> strMap = new HashMap<String, Integer>();

        strMap.put("one", 1);

        newMap.putAll(strMap);




        Set<String> allKys=newMap.keySet();

        Iterator iterator= allKys.iterator();


        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }





    }
}