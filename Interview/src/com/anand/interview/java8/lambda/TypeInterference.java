package com.anand.interview.java8.lambda;

public class TypeInterference {

	public static void main(String[] args) {
		
		myLamdaString stringLen = 	(String s) -> s.length();
		
		typeinterference ((String s) -> s.length());
	}
	
	
	public static void typeinterference (myLamdaString obj)
	{
		System.out.println(obj.stringLengthCal("calclate my length"));
	}

}

interface myLamdaString
{
	int stringLengthCal (String s);
}

