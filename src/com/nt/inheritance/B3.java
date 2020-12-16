package com.nt.inheritance;

public class B3 extends A3 {
	int y=m2();

	 int m2() {
		System.out.println("B non static variable");
		return 20;
	}
	 {
		 System.out.println("B non static block");
	 }
	 B3(){
		 System.out.println("B Constructor");
	 }
	 public static void main(String[] args) {
		System.out.println("B main");
		B3 b=new B3();
		System.out.println("B main x:"+b.x);
		System.out.println("B main y:"+b.y);
				
	}

}
