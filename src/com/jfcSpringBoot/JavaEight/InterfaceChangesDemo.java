package com.jfcSpringBoot.JavaEight;

public class InterfaceChangesDemo implements StaticDefaultDemoChanges{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceChangesDemo interfaceChangesDemo=new InterfaceChangesDemo();
		interfaceChangesDemo.abstractMethod();
		interfaceChangesDemo.defaultMethod();
		StaticDefaultDemoChanges.staticMethod();

	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("i am from abstract method implememted by child");
	}

}
