package com.java;
import java.util.*;
//Create an ArrayList of your favorite movies.
//Use:
//- add(E e) → Add 5 movie names.
//- add(int index, E element) → Insert a movie at position 2.
//Print the entire list.
public class Question_1 {
    public void Creating_and_Adding_Elements(){
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("The killer");
        arrayList.add("Zameen");
        arrayList.add("Tere_Naam");
        arrayList.add("Nayak");
        arrayList.add("Singham");
        arrayList.add(2,"The Man");
        System.out.println(arrayList);
//        for (int i = 0; i <arrayList.size() ; i++) {
//            System.out.println(arrayList.get(i));

//        }


    }

}
