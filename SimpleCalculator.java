package com.java.practoice;
import java.util.Scanner;
public class SimpleCalculator {
	static int ans=0;
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("1.Addition.\n2.Subtraction\n3.Multiplication.\n4.Division.\n");
	System.out.println("Enter your choice: ");
	int choice = scan.nextInt();
	System.out.println("Number 1 : ");
	int num1 = scan.nextInt();
	System.out.println("Number 2 : ");
	int num2 = scan.nextInt();
	
	switch(choice) {
	case 1:
		ans = num1+num2;
		break;
	case 2:
		ans = num1-num2;
		break;
	case 3:
		ans = num1*num2;
		break;
	case 4:
		ans = num1/num2;
		break;
	default:
		System.out.println("Error: Enter a valid number");
		
		
	}
	System.out.println("Answer: "+ans);
	
}
}
