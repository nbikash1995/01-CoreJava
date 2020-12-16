package com.nt.wraper;

public class WrapperClassesDemo {
	public static void main(String[] args) {
		/*//1.PDT=>WCO conversion
		int i=50;
		Integer io1=new Integer(i);
		Integer io2=new Integer(i);
	    
		System.out.println("i:"+i);
		System.out.println(("io1:"+io1));
		System.out.println("io2:"+io2);
		Byte b1=new Byte((byte) 50);
		Character ch1=new Character('a');
		Character ch2=new Character((char) 97);
		Boolean bo=new Boolean(true);
		Float f1=new Float('a');
		Float f2=new Float(32.56f);
		Float f3=new Float(50.45);
		Double d1=new Double(67.54);
		Double d2=new Double(98);
		Double d3=new Double('a');
		System.out.println(ch2);
		//wrapper class object to primitive type conversion
		Integer io3=Integer.valueOf(254);
		int x=io3.intValue();
		byte b=io3.byteValue();
		short s=io3.shortValue();
		float f=io3.floatValue();
		System.out.println("X:"+x);
		System.out.println("B:"+b);
		System.out.println("S:"+s);
		System.out.println("F:"+f);
		char ch3=(char) io3.intValue();
		//Boolean bo1=io3.intValue();
		*/
		//pso=> wco conversion
		Integer io1=new Integer("10");
		Integer io2=Integer.valueOf("1");
		Byte bo1=Byte.valueOf("1");
		Byte bo2=Byte.valueOf("128");
		Integer io3=Integer.valueOf("a");
		Integer io4=new Integer("5.4");
		Integer io5=Integer.valueOf("5L");
		Long l1=Long.valueOf("10");
		Long lo2=new Long("5L");
		Byte b1=new Byte((byte) 10);
		//Integer i1=b1;
		//Integer i2=(Integer)b1;
		Integer i3=new Integer(10);
		//System.out.println(b1==i3);
	}
}
