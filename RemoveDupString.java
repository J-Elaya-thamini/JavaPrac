package com.java.practoice;
import java.util.Scanner;
public class RemoveDupString {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a string : ");
	String str = scan.nextLine();
	int count =1;
	String res1 = "";
	//String res2 = "";
	for(int i=0;i<str.length()-1;i++) {
		if(str.charAt(i)==str.charAt(i+1)) {
			count++;
//			res += str.charAt(i+1);//+ str.charAt(i+1);
		}
		else {
			res1 += str.charAt(i);
			res1+=count;
			count=1;
		}
	}
	res1 += str.charAt(str.length()-1);
	if(count>1)
		res1+=count;
	System.out.println("Result: "+res1);
	
}
}