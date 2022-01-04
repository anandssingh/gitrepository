package com.java.core.examples;

public class BreakExample {

	public static void main(String[] args) {
		// Java program to demonstrate using 
		// break to exit a loop 
				// Initially loop is set to run from 0-9 
				for (int i = 0; i < 5; i++) {
						for (int j = 0; j < 3; j++) {
							// Terminate the loop when i is 5 
							//if (i == 2) {
							//	break; 
							//}
							System.out.println("inner loop i: " + i +" j "+j); 
						}
						if (i == 2) {
							break; 
						}
					System.out.println("outer loop  i: " + i ); 
				} 
				System.out.println("Out of Loop"); 
			} 

}
