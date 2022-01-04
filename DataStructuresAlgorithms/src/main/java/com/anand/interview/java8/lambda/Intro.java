package com.anand.interview.java8.lambda;

public class Intro {

	public static void main(String[] args) {
		
		myLamda printLine = 	() -> System.out.println("firt lambda");
		myAdd addTwovariable = (int a , int b) ->  {int c = a+b; int d = a*b ; return d;};
		
		int add = addTwovariable.justAdd(2, 3);
		
		printLine.justPrint();
		 System.out.println(add) ;
	}

}

interface myLamda 
{
	void justPrint ();
}

interface myAdd 
{
	int justAdd (int a , int b);
}