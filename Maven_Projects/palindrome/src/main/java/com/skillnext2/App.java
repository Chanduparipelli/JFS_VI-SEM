package com.skillnext2;

public class App {
    public static void main(String[] args) {
        String s = "madam";
        
        String reversed = new StringBuilder(s).reverse().toString();
        
        if (reversed.equals(s)) {
            System.out.println(s + " is a Palindrome");
        } else {
            System.out.println(s + " is not a Palindrome");
        }
    }
}
