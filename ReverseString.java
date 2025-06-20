package com.java.practoice;
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a= sc.nextLine();
		String b=a;
		String newstring ="";
		for(int i =a.length()-1;i>=0;i--)
		{
			newstring+=a.charAt(i);
		}
		if(newstring.equals(b))
			System.out.println("it is palindrome");
		else
			System.out.println("not a palindrome");
	}
}
