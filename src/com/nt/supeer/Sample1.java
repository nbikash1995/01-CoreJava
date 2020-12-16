package com.nt.supeer;

public class Sample1 extends Example1 {
	int x=30;
	int y=40;
	void m2() {
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
		System.out.println();
		System.out.println("X:"+super.x);
		System.out.println("Y:"+super.y);
	}
	void m3() {
		int x=50;
		int y=60;
		System.out.println("Local X:"+x);
		System.out.println("Local Y:"+y);
		
		System.out.println("subclass X:"+this.x);
		System.out.println("subclass Y:"+this.y);
		
		System.out.println("Superclass X:"+super.x);
		System.out.println("Superclass Y:"+super.y);
	}
	public static void main(String[] args) {
		Sample1 s=new Sample1();
		s.m2();
		s.m3();
	}

}
