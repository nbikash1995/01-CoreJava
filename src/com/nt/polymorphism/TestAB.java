package com.nt.polymorphism;

public class TestAB {
	public static void main(String[] args) {
		B12 b=new B12();
		b.m1();
		b.m2();
		b.m3();
		b.m3("abc");
		b.m3(45.3f, 67);
		A12 a=new A12();
		a.m1();
		a.m2();
		a.m3();
		a.m3("bbc");
	
	}

}
