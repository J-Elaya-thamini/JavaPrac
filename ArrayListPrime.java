package com.java.practoice;
import java.util.ArrayList;
public class ArrayListPrime {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(6);
		l1.add(24);
		l1.add(17);
		l1.add(9);
		l1.add(5);
		l1.add(4);
		l1.add(2);
		System.out.println("Before removing prime numbers : "+l1);
		int n = l1.size();
		//int pos=2;
		int num;
		for(int i=n-1;i>=0;i--) {
			num = l1.get(i);
			boolean isPrime = true;
			if(num<=1) {
				isPrime = false;
			}
			else {
				for(int j=2;j<=Math.sqrt(num);j++) {
					if(num%j==0) {
						isPrime = false;
						break;
					}
				}
			}
			if(isPrime) {
				l1.remove(i);
			}
			/*while(pos<=first) {
				if(first%pos==0) {
					l1.remove(first);
				}
				else {
					pos++;
				}
			}*/
		}
		System.out.println("After removing prime number : "+l1);
	}

	
}
