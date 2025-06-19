package com.java.practoice;
import java.util.Scanner;
public class ReverseInteger {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rev=0;
		System.out.print("Enter the number : ");
		int num = scan.nextInt();
		int n = num;
		int x,rem;
		while(num!=0) {
			rem = num%10;
			rev= rev * 10 + rem;
			num/=10;
		}
		System.out.println("Reverse digit is "+rev);
		if(rev==n)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		
		
		
	}
}
