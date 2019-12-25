package Excercises;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeUsingQndStackBoth {

    public static void main(String[] args) {
        String str = new String("attba");
        String str2 = new String("aaaa");
        System.out.println(isPal(str));
        System.out.println(isPal(str2));
    }

    public static boolean isPal(String str) {
        Stack<String> stack = new Stack<String>();
        Queue<String> queue = new LinkedList<String>();


        int len1;
        String newStr;

        len1 = str.length();

        for (int i = 0; i < len1; i++) {

            newStr = str.charAt(i) + "";
            System.out.println(newStr);
            stack.push(newStr);
            queue.add(newStr);
        }

        while (!queue.isEmpty()) {

            if (!stack.pop().equals(queue.remove())) {
                {
                    return false;
                }
            }
        }

        return true;
    }

}