package com.nt.supeer;

public class B55 extends A55 {
	static int a=50;
	int x=60;
	static void m1() {
		System.out.println("B class m1");
	}
	void m2() {
		System.out.println("B class m2");
		super.m2();
	}
	void m4() {
		System.out.println(super.a+" "+a);
		System.out.println(super.x+" "+x);
		super.m1();
		m1();
		super.m2();
		m2();
	}
	public static void main(String[] args) {
		B55 b=new B55();
		b.m4();
	}

}
