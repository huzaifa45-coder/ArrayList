package com.java;
import java.util.*;
//Use:
//- contains(Object o)
//- indexOf(Object o)
//- lastIndexOf(Object o)
//Display results.
public class Question_4 {
    public void Searching_and_Checking(){
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("The killer");
        arrayList.add("Zameen");
        arrayList.add("Tere_Naam");
        arrayList.add("Nayak");
        arrayList.add("Singh-am");
        // Use contains(Object o) to check if a movie exists
        System.out.println(arrayList.contains("The killer"));
        // Use indexOf(Object o) to find the first occurrence
        System.out.println(arrayList.indexOf("Nayak"));
        // Use lastIndexOf(Object o) to find the last occurrence
        System.out.println(arrayList.lastIndexOf("Nayak"));
        System.out.println(arrayList);


    }
}
