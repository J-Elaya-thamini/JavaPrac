package com.java.practoice;
import java.util.Scanner;
public class ArrayException {
	public static void main(String[] args) {
		int[] arr = {10,11,15,0,12,5};
		/*
		try {
			System.out.println(arr[7]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: "+e.getMessage());
		}
		*/
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<5;i++) {
			try {
			int result = division(n,arr[i]);
			System.out.println(result);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
			
			}
		public static int division(int num1,int num2) {
			if(num2==0) {
				throw new ArithmeticException("Value is zero");
				
			}
			return  num1/num2;
		}
		
	
}
