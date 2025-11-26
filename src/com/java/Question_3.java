package com.java;

import java.util.ArrayList;

//Use:
//- remove(int index) → Remove the movie at index 1.
//- remove(Object o) → Remove a movie by its name.
//Print the updated list.
public class Question_3 {
    public void Removing_Elements(){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("The killer");
        arrayList.add("Zameen");
        arrayList.add("TereNaam");
        arrayList.add("Kayak");
        arrayList.add("Singh-am");
        arrayList.remove(1);
        arrayList.remove("The killer");
        System.out.println("updated list "+arrayList);
    }
}
