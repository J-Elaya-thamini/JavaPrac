package com.java.practoice;
import java.util.ArrayList;
public class ArrayListAssign {
	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>();
		ArrayList<String> l2 = new ArrayList<>();
		l1.add("Vanissa");
		l1.add("Bell");
		l1.add("Nozel");
		l1.add("Fuegoleon");
		l1.add("Noelle");
		System.out.println("List 1 : "+l1);
		l2.add("Yami");
		l2.add("Julius");
		l2.add("Mereoleona");
		l2.add("Asta");
		l2.add("Yuno");
		System.out.println("List 2 : "+l2);
		l3 = l1.addAll(l2);
		System.out.println();
	}
}
