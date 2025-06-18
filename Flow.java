package com.java.practice.opps;

public class Flow {
	static {
		System.out.println("Static");
	}
	{
		System.out.println("Instance");
	}
	Flow(){
		System.out.println("Constructor 3  b ");
	}
	public static void main(String[] args) {
		new Flow();
		new Flow();
	}
}
