//package com.java;
////We need a Scanner to read input from the user
//import java.util.Scanner;
//public class InfixToPostfixEvaluator {
//    //This is the entry point of the program.
//    public static void main(String[] args) {
//        //input stores the infix expression, e.g., "5+12*2".
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter expression: ");
//        String input = sc.nextLine();
////We manually create operator stack and number stack.
////topOp and topNum track the top index in each stack.
//        char[] stackOp = new char[50];
//        int topOp = -1;
//        int[] stackNum = new int[50];
//        int topNum = -1;
////postfix will store the converted expression.
////
////i is used to iterate over the input string.
//        String postfix = "";
//        int i = 0;
////We loop over each character of the input.
//        // Infix → Postfix
//        while (i < input.length()) {
//            char c = input.charAt(i);
//            // skip space
//            if (c == ' ') { i++; continue; }
//            //Collects full numbers (like 12 instead of just 1) and adds space as a separator in postfix.
//            if (c >= '0' && c <= '9') {
//                while (i < input.length() && input.charAt(i) >= '0' && input.charAt(i) <= '9')
//                    postfix += input.charAt(i++);
//                postfix += ' ';
//                continue;
//            }
//            //Push '(' to the operator stack.
//            else if (c == '(') stackOp[++topOp] = c;
//            //Pop operators until '(' is found.
//            else if (c == ')') {
//                postfix += ' ';
//                while (topOp != -1 && stackOp[topOp] != '(') postfix += stackOp[topOp--];
//                if (topOp != -1) topOp--;
//            }
//            //While the top operator in the stack has higher or equal precedence, pop it to postfix.
//            //
//            //Push the new operator onto the stack.
//            else {
//                postfix += ' ';
//                while (topOp != -1 && precedence(stackOp[topOp]) >= precedence(c))
//                    postfix += stackOp[topOp--];
//                stackOp[++topOp] = c;
//            }
//            i++;
//        }
////Add remaining operators to the postfix expression.
//        postfix += ' ';
//        while (topOp != -1) postfix += stackOp[topOp--];
//
//        System.out.println("Postfix: " + postfix);
////Reset i and prepare to read postfix expression.
////
////num collects digits of a number.
//        // Evaluate Postfix
//        i = 0; String num = "";
//        while (i < postfix.length()) {
//            char c = postfix.charAt(i);
////            Append digit to num.
//            if (c >= '0' && c <= '9') num += c;
////When we hit space, push the full number onto the number stack.
//            else if (c == ' ' && num.length() > 0) {
//                stackNum[++topNum] = Integer.parseInt(num);
//                num = "";
//            }//Pop top 2 numbers, apply the operator, push the result.
//            else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
//                int b = stackNum[topNum--];
//                int a = stackNum[topNum--];
//                int res = 0;
//                if (c == '+') res = a + b;
//                else if (c == '-') res = a - b;
//                else if (c == '*') res = a * b;
//                else if (c == '/') res = a / b;
//                else if (c == '^') res = (int)Math.pow(a, b);
//                stackNum[++topNum] = res;
//            }
//            i++;
//        }
////The final value is at the top of the number stack.
//        System.out.println("Result: " + stackNum[topNum]);
//    }
////Determines operator priority for the conversion.
//    static int precedence(char op) {
//        if (op == '+' || op == '-') return 1;
//        if (op == '*' || op == '/') return 2;
//        if (op == '^') return 3;
//        return 0;
//    }
//}
