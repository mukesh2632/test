package com.text;

import java.util.Scanner;

public class Framework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("Yes, it is a palindrome.");
        } else {
            System.out.println("No, it is not a palindrome.");
        }
    }
     public static boolean isPalindrome(String str) {
     str = str.toLowerCase();
     int length = str.length();
        for (int i = 0; i < length / 2; i++) {
         if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
      }
         return true;
    }
}
