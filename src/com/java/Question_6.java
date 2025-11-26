package com.java;
import java.util.*;
//Use:
//        1. for loop with get(i)
//2. Enhanced for-each
//3. Iterator (iterator() method)

public class Question_6 {
    public void Iteration(){
        ArrayList<Integer>Arraylist = new ArrayList<>();
        Arraylist.add(1);
        Arraylist.add(2);
        Arraylist.add(3);
//        for (int i = 0; i <Arraylist.size() ; i++) {
//            System.out.println(Arraylist.get(i));
        // this for -each loop
//            for (int Array : Arraylist){
//                System.out.println(Array);

            Iterator <Integer> it = Arraylist.iterator();
            while (it.hasNext()){
                    if (Arraylist.get(1) ==1) {
                        System.out.println(Arraylist);
                    }
            }
            }
            }
