package com.java.practice.opps;

abstract class test {
	abstract void disp();
	abstract void cool();
}
class demo extends test{
	void disp() {
		System.out.println("Hi");
	}
	void cool() {
		System.out.println("Hello");
	}
}
class AbstractClass{
	public static void main(String[] args) {
		demo obj = new demo();
		obj.disp();
		obj.cool();
	}
}
