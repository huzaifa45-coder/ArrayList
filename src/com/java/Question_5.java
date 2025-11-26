package com.java;

import java.util.ArrayList;

//Q5. Size and Empty Checks
//Use:
//- size()
//- isEmpty()
//- clear()
public class Question_5 {
    public void Size_and_Empty_Checks(){
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);
        arrayList.add(25);
//        System.out.println(arrayList.size());//returns a number (how many elements in the list).
//        System.out.println(arrayList.isEmpty());//returns a boolean (true or false).
        arrayList.clear();//removes all elements (it does not return anything).

//        System.out.println(arrayList);


    }
}
