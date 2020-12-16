package com.nt.inheritance;

public class Example1 {
	static int a=m1();
	static {
		System.out.println("Example static block");
	}
	int x=m2();
	{
		System.out.println("Example non static block is created");
	}
	public Example1() {
		System.out.println("Example constructor is created");
	}

	 static int m1() {
		System.out.println("Example static variable is created");
		return 10;
	}

	 int m2() {
		System.out.println("Example non static variable is created");
		return 20;
	}
	 void abc() {
		 System.out.println("Example abc");
	 }
	 void bbc() {
		 System.out.println("Example bbc");
	 }

}
