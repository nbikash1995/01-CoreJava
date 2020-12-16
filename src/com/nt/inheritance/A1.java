package com.nt.inheritance;

public class A1 {
	static int a=m1();
	static int m1() {
		System.out.println("A1 static variable");
		return 10;
	}
	static {
		System.out.println("A1 static block");
	}
	/*public static void main(String[] args) {
		System.out.println("A main");
	}*/

}
