package com.nt.polymorphism;

public class Sample1 extends Example1 {
	void m1() {
		System.out.println("Sample m1");
	}
	void m2() {
		super.m2();
		System.out.println("Sample m2");
	}
	public static void main(String[] args) {
		Sample1 s=new Sample1();
		s.m1();s.m2();s.m3();
	}

}
