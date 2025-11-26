package com.java;

import java.util.*;
public class Final_stack {
    public static class Finalstack {

        int size = 5;
        int[] array = new int[size];
        int top = -1;
        // Push method

        public void push(int x) {
            if (top == size - 1) {
                System.out.println("Stack is Full");
            }
            top++;
            array[top] = x;
            System.out.println(x + "Push into stack at index"+ top);
        }

        // Pop method
        public void pop() {
            if (top == -1) {
                System.out.println("Stack is Empty");
            }
            int y = array[top];
            top--;
            System.out.println(y + "popped from stack at index"+ (top+1));


        }

        // Peep method
        public void peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
            }
            System.out.println("Top element is: " + array[top]);
        }
    }

    public static void main(String[] args) {
        Finalstack f = new Finalstack();
        f.push(10);
        f.push(20);
        f.push(30);
        f.push(40);
        //f.push(50);
        f.peek();
        f.pop();
        System.out.println("After popping one element:");
        f.peek();
    }
}
