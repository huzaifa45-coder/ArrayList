//package com.java;
//import java.util.Scanner;
//public class InfixPostfixEval {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter infix expression (numbers and operators): ");
//        String infix = sc.nextLine();
//
//        // ----- Part 1: Convert Infix to Postfix -----
//        char[] st = new char[50];
//        int top = -1;
//        String post = "";
//
//        for (int i = 0; i < infix.length(); i++) {
//            char ch = infix.charAt(i);
//
//            if (ch == ' ') continue;                  // ignore spaces
//            if (Character.isDigit(ch)) post += ch;   // operand
//            else if (ch == '(') st[++top] = ch;      // (
//            else if (ch == ')') {                     // )
//                while (st[top] != '(') post += st[top--];
//                top--;
//            } else {                                    // operator
//                int p1 = (ch == '+' || ch == '-') ? 1 : (ch == '*' || ch == '/') ? 2 : 3;
//                while (top != -1 && st[top] != '(') {
//                    int p2 = (st[top] == '+' || st[top] == '-') ? 1 :
//                            (st[top] == '*' || st[top] == '/') ? 2 : 3;
//                    if (p2 >= p1) post += st[top--];
//                    else break;
//                }
//                st[++top] = ch;
//            }
//        }
//
//        while (top != -1) post += st[top--];
//
//        System.out.println("Postfix: " + post);
//
//        // ----- Part 2: Evaluate Postfix -----
//        int[] valStack = new int[50];
//        int valTop = -1;
//
//        for (int i = 0; i < post.length(); i++) {
//            char ch = post.charAt(i);
//
//            if (Character.isDigit(ch)) {
//                valStack[++valTop] = ch - '0'; // convert char to int
//            } else {
//                int b = valStack[valTop--];
//                int a = valStack[valTop--];
//                int res = 0;
//                switch (ch) {
//                    case '+' -> res = a + b;
//                    case '-' -> res = a - b;
//                    case '*' -> res = a * b;
//                    case '/' -> res = a / b;
//                }
//                valStack[++valTop] = res;
//            }
//        }
//        System.out.println("Result: " + valStack[valTop]);
//    }
//}