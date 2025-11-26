package com.java;
import java.util.ArrayList;
//Add integers in an ArrayList<Integer>.
//        Use:
//        - Collections.sort(list)
//- Collections.reverse(list)
//- clone()
//Print before and after sorting/reversing.
public class Question_7 {
    public void Sorting_and_Copying(){
        ArrayList <String> arrayList1 = new ArrayList<>();
        arrayList1.add("Huzaifa");
        arrayList1.add("Ali");
        arrayList1.add("ismail");

//        Collections.sort(arrayList); it can arrange the value
//        Collections.reverse(arrayList);// it can reverse the array
        ArrayList <String> Arraylist2 = (ArrayList<String>)arrayList1.clone();
        System.out.println("Original: " + arrayList1);
        System.out.println("Cloned:   " + Arraylist2);








    }
}
