package com.nt.polymorphism;

public class MOL1 {
	void m1(int a) {
		System.out.println("int-arg");
	}
	void m1(char ch) {
		System.out.println("char-arg");
	}
	public static void main(String[] args) {
		MOL1 a1=new MOL1();
		a1.m1(99);
		a1.m1('c');
		a1.m1((char)100);
		a1.m1((int)'d');
	}

}
