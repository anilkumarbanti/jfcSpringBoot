package com.jfcSpringBoot.jbasics;

class Sample{
	String name;
	static String scity;
}

public class VariableDemo {
	
	int b; // non static scenario and instance variable
	static int c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableDemo  vd=new VariableDemo();
		Sample sam=new Sample();
		int a=10; //local 
		System.out.println(a);
		System.out.println(vd.b);
		System.out.println(c);
		System.out.println(sam.name);
		System.out.println(Sample.scity);

	}

}
