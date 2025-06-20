package com.java.practoice;

public class ArrayException {
	public static void main(String[] args) {
		int[] arr = {10,11,15,0,12,5};
		try {
			System.out.println(arr[7]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
}
