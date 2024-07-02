package com.jfcSpringBoot.JavaEight;

public interface StaticDefaultDemoChanges {
	
	//Abstract method
	void abstractMethod();
	
	//Default method
	default void defaultMethod()
	{
		System.out.println("I am from Default method/Interface");
	}
	
	//static method
	
	static void staticMethod()
	{
		System.out.println("I am from Static method/Interface");
	}
	

}
