package com.nt.supeer;

public class Sample extends Example {
	public Sample() {
		//super();
		System.out.println("Sample Zero-param Constructor");
	}
	Sample(int a){
		//super(10);
		System.out.println("Sample int-param");
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		Sample s1=new Sample(5);
	}

}
