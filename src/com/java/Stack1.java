package com.java;
import java.util.Scanner;
public class Stack1 {


        private final int SIZE = 5;
        private int[] arr = new int[SIZE];
        private int top;

        // Constructor (Initialize Stack)
        Stack1() {
            top = -1;
        }

        // PUSH
        public void push(int x) {
            if (top == SIZE - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            top++;
            arr[top] = x;
            System.out.println(x + " pushed into stack");
        }

        // POP
        public int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int value = arr[top];
            top--;
            return value;
        }

        // PEEP (view top element)
        public void peep() {
            if (top == -1) {
                System.out.println("Stack is empty");
            } else {
                System.out.println("Top element is: " + arr[top]);
            }
        }

        // DISPLAY (optional)
        public void display() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return;
            }

            System.out.print("Stack Elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

