package com.java;

import java.util.Scanner;

public class stack {
    int SIZE = 5;
    int[] stack = new int[SIZE];
    int top = -1;  // stack empty

    // Push method
    void push(int x) {
        if (top == SIZE - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = x;
            System.out.println(x + " pushed into stack");
        }
    }

    // Pop method
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int y = stack[top];
            top--;
            return y;
        }
    }

    // Peep method (view top)
    void peep() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }

}
