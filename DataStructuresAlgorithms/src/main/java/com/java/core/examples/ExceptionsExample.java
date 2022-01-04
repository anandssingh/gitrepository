package com.java.core.examples;

import java.io.EOFException;

public class ExceptionsExample {

	public static void main(String[] args) {

	}

	int parseInt(String s) throws NumberFormatException {
		boolean parseSuccess = false;
		int result = 0;
		// do complicated parsing
		if (!parseSuccess) // if the parsing failed
			throw new NumberFormatException();
		return result;
	}

	
}

class Test {
	public int myMethod1() throws EOFException {
		return myMethod2();
	}

	public int myMethod2() throws EOFException {
		// code that actually could throw the exception goes here
		return 1;
	}
}
