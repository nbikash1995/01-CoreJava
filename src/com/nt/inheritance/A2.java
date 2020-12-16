package com.nt.inheritance;

public class A2 {
	static int a=10;
	static {
		System.out.println("In A static Block");
		System.out.println("a:"+a);
		//System.out.println("b:"+b);we cann not access sub class static variable directly by their name
		System.out.println("b:"+B2.b);
		System.out.println("b:"+B2.getB());
		
	}
	public static void main(String[] args) {
		
	}

}
