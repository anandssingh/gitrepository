package com.anand.interview.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

		List<Integer> I = new ArrayList<Integer>();
		 I.add(10);
		 I.add(15);
		 I.add(14);
		 I.add(13);
		 I.add(14);
		 I.add(15);
		 System.out.println(I);
		 
		 List<String> IS = new ArrayList<String>();
		 IS.add("aStrISngh");
		 IS.add("aStrISngh");
		 IS.add("bStrISngh");
		 IS.add("cStrISngh");
		 IS.add("cStrISngh");
		 IS.add("aStrISngh");
		 System.out.println(IS);
		 
		 
		 
		 filterc(I);
		 Add5(I);
		 StringStartWith(IS);
		 count3 (I);
		 
	}
	
	public static void filterc (List<Integer> I)
	{
		List finalNumber = I.stream().filter(i->i%2!=0).collect(Collectors.toList());
		
		System.out.println("odd number "+finalNumber);
	}
	
	public static void Add5 (List<Integer> I)
	{
		List finalNumber = I.stream().map(i->i+2).collect(Collectors.toList());
		
		System.out.println("add each no by 2 "+finalNumber);
	}
	
	public static void StringStartWith (List<String> I)
	{
		List finalNumber = I.stream().filter(i->i.startsWith("a")).collect(Collectors.toList());
		
		System.out.println("String start with a  "+finalNumber);
		
		//String “Contain” Method
		//Length
		//indexOf
		//charAt
		//endsWith
		//String “replaceAll” & “replaceFirst” Method
		//String Java “tolowercase” & Java “touppercase” Method
		
		//String “CompareTo” Method equal = 0 less -neg  more +pos
		
	}
	
	
	public static void count3 (List<Integer> I)
	{
		Long finalNumber = I.stream().filter(i->i>13).count();
		
		System.out.println("Count no greater than 13 "+finalNumber);
	}
	
	
	

}
