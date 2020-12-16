package com.nt.inheritance;

public class Sample1 extends Example1 {
	static int b=m3();
	static {
		System.out.println("Sample static block");
	}
	int y=m4();
	{
		System.out.println("Sample non static block");
	}
	Sample1(){
		System.out.println("Sample Constructor");
	}

	 static int m3() {
		System.out.println("Sample static variable is created");
		return 30;
	}

	 int m4() {
		System.out.println("Sample non static variable");
		return 40;
	}
	 void abc() {
		 System.out.println("Sample abc");
	 }
	 void bbc() {
		 System.out.println("Sample bbc");
	 }
	 public static void main(String[] args) {
		System.out.println("Sample main");
		Sample1 s=new Sample1();
		s.abc();
		s.bbc();
		//System.out.println(Example1.a);
	}

}
