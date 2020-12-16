package com.nt.wraper;

public class WrapperClassesComparision {
	public static void main(String[] args) {
		/*int i1=10,i2=20;
		System.out.println(i1==i2);
		//System.out.println(i1.equals(i2));
		Integer io1=new Integer(20);
		Integer io2=new Integer(30);
		System.out.println(io1==io2);
		System.out.println(io1.equals(io2));
		Double d1=new Double(10.5);
		//System.out.println(i01==d1);
		System.out.println(io1.equals(d1));
		double do1=10.23;
		System.out.println(i1==do1);
		System.out.println(io1.equals(d1));
		byte b1=40;
		//byte b2=128;
		int i='a';
		long l=50;
		Byte bo1=40;
		Byte bo2=(byte) 128;
		Integer io=(int) 'a';
		*/
		byte b1=50;
		int i1=b1;
		int i2=50;
		byte b2=(byte) i2;
		int i3='a';
		double d1=50;
		double d2=60L;
		double d3=45.6f;
		double d4=30.35;
		double d5='t';
		byte bo2=new Integer(50).byteValue();
		int i01=new Byte((byte) 50);
		int i02=new Integer(50);
		byte bo3=new Integer(i02).byteValue();
		System.out.println(bo3);
		
	}

}
