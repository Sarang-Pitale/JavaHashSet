package com.sample;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Demo {
    public static void main(String[] args) {

        // ArrayList is just for comparission and addition to hashset
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(40);
        arrayList.add(1, 15);
        System.out.println(arrayList.indexOf(30));
        System.out.println(arrayList);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        arrayList1.add(40);
        arrayList1.add(40);
        arrayList1.remove(4);
        arrayList1.add(1, 15);

        HashSet<Integer> hashSet = new HashSet<>(); //constructor
        hashSet.add(60);   //Adding element
        hashSet.add(70);
        hashSet.add(50);
        hashSet.add(80);
        hashSet.add(90);
        hashSet.add(100);
        hashSet.remove(70);  //Remove Element
        System.out.println(hashSet);
        hashSet.addAll(arrayList); // Add Collection
        System.out.println(hashSet);
        hashSet.addAll(arrayList1);
        System.out.println("*************************************");
        hashSet.stream().sorted().forEach(n -> {   // Streams for sorting
            System.out.println(n);
        });
        System.out.println(hashSet);
        System.out.println(hashSet.size()); //Getting Size
        System.out.println(hashSet.isEmpty()); //Check if Empty
        System.out.println(hashSet.contains(70)); // Check if Set contains the element

        hashSet.clear(); //Clear the set
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());


    }
}
