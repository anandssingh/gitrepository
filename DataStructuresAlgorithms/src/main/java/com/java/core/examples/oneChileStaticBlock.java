package com.java.core.examples;

public class oneChileStaticBlock extends twoparent {
	static {
		System.out.println("inside child satic block");
	}

	oneChileStaticBlock() {
		System.out.println("inside child constructor ");
	}

	{
		System.out.println("inside child initialization block");
	}

	public static void main(String[] args) {
		System.out.println("inside main");
		new oneChileStaticBlock();
		// new oneChileStaticBlock();
		System.out.println("last main");
	}
}

class twoparent {
	static {
		System.out.println("inside parent Static block");
	}
	{
		System.out.println("inside parent initialisation block");
	}

	twoparent() {
		System.out.println("inside parent constructor");
	}
}
