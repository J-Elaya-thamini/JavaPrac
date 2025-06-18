package com.java.practoice;

public class Human {
	public void eat (String food) {
		System.out.println("Human eats "+food);
	}
	public void sleep(String res) {
		System.out.println("Human sleeps "+ res);
	}
	public static void main(String[] args) {
		Human humStud = new Student(); //method overriding 
		humStud.eat("Idly");
		humStud.sleep("Early");
	}
}

class Student extends Human{
	public void eat(String food) {
		System.out.println("Students eat "+food);
	}
	public void sleep(String res) {
		System.out.println("Students sleep "+res);
	}
}


