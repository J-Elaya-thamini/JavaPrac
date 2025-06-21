package com.java.practoice;

public class ThreadCreation extends Thread{
	
	    public void run() {
	        System.out.println("Thread-");
	    }

	    public static void main(String[] args) {
	        ThreadCreation t1 = new ThreadCreation(); 
	        t1.start();                   
	    }
	}


