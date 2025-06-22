package com.java.practoice;
import java.util.Scanner;

public class SubarrayPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();

        System.out.println("Palindromic substrings are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (isStringPalindrome(sub)) {
                    System.out.println(sub);
                }
            }
        }
    }

    public static boolean isStringPalindrome(String sub) {
        int left = 0;
        int right = sub.length() - 1;

        while (left < right) {
            if (sub.charAt(left) != sub.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}