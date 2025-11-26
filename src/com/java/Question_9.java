package com.java;

import java.util.LinkedList;

//— LinkedList Practice
//Q9. Basic Add and Retrieve
//Create a LinkedList<String> of cities.
//Use:
//- add(E e)
//- addFirst(E e)
//- addLast(E e)
//Use getFirst() and getLast() to print first and last cities.
public class Question_9 {
    public void Basic_Add_and_Retrieve(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Huzaifa");
        linkedList.add("ali");
        linkedList.add("ismail");
        linkedList.add("Usman");
        linkedList.addFirst("Aqib");
        linkedList.addLast("Ahmad");
        System.out.println("All name :"+linkedList);

        System.out.println("First name: " +linkedList.getFirst());
        System.out.println("last name: " +linkedList.getLast());
    }
}
