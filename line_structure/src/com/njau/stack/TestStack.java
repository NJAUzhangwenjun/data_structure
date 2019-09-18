package com.njau.stack;

import java.util.Stack;

/**
 * @author 张文军 @Description: @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/515:22
 */
public class TestStack {
    public static void main(String[] args) {
        Boolean aTrue = isTrue("}");
        System.out.println(aTrue);
    }

    public static Boolean isTrue(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }
            if (!stack.isEmpty()) {
                if (c == '}' && stack.pop() != '{') {
                    return false;
                } else if (c == ')' && stack.pop() != '(') {
                    return false;
                } else if (c == ']' && stack.pop() != '[') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
