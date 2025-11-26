package com.java;

import java.util.ArrayList;
import java.util.*;

//Use:
//- toArray()
//- subList(int fromIndex, int toIndex)
public class Question_8 {
    public void Conversion_and_Sublist(){
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Huzaifa");
        arrayList.add("Ali");
        arrayList.add("usman");
        arrayList.add("Ahmed");
//        System.out.println(arrayList);
//        String[] array = arrayList.toArray((new String[0]));
//        System.out.println(array[0]);
        List<String> sub = arrayList.subList(1,4);
        System.out.println(sub);





    }
}
