package com.hackbulgaria.collgen0.expression;

import java.util.EmptyStackException;
import java.util.Stack;

public class CheckExp {

    public boolean isExpressionCorrect(String str) {

        Stack<Character> stack = new Stack<Character>();

        if (str.charAt(0) == ')')
            return false;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                try {
                    if (stack.peek() == '(') {
                        stack.pop();
                    }
                } catch (EmptyStackException e) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
