package com.java;

import java.util.LinkedList;

//- removeFirst()
//- removeLast()
//- remove(Object o)
//Display updated list.
public class Question_10 {
    public void Remove_Operations(){
        LinkedList<String>linkedList = new LinkedList<>();
        linkedList.add("ali");
        linkedList.add("huzaifa");
        linkedList.add("umer");
        linkedList.add("usman");
        System.out.println("original:"+linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove("umer");// this_remove only correct work in String_list because- remove(Object o)
        System.out.println("updated:"+linkedList);



    }
}
