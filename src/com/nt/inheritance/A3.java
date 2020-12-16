package com.nt.inheritance;

public class A3 {
	int x=m3();

	 int m3() {
		System.out.println("A non static variable");
		return 10;
	}
	 {
		 System.out.println("A non static block");
	 }
	 A3(){
		 System.out.println("A Constructor");
	 }

}
