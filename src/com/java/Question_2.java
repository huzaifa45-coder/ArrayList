package com.java;
import java.util.*;
//Accessing and Updating
//Use get(int index) to print the 3rd movie.
//Use set(int index, E element) to replace the 2nd movie with another title.
//Display the modified list.
public class Question_2 {
    public void Accessing_and_Updating() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("The killer");
        arrayList.add("Zameen");
        arrayList.add("Tere_Naam");
        arrayList.add("Nayak");
        arrayList.add("Singh-am");
        System.out.println(arrayList);
        System.out.println( arrayList.get(2));
        arrayList.set(1,"Earth");
        System.out.println("Updated list"+arrayList);

    }
}
