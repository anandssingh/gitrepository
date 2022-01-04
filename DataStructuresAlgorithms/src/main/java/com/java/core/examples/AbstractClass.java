package com.java.core.examples;

public abstract class AbstractClass {

	public static void main(String[] args) {
		for (int j = 0; j < 3; j++) {
            System.out.println(" innerloop " + j); 
        } 
	}
	
	private static void main(String[] args, int t) {
		for (int j = 0; j < 3; j++) {
            System.out.println(" innerloop " + j); 
        }
	}

}
