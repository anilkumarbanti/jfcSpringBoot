package com.jfcSpringBoot.JavaEight;

@FunctionalInterface
interface Show
{
	public void display();
}

@FunctionalInterface
interface Sayable
{
	public String say(String name);
}
public class LambdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		
		Show show=() ->{
			System.out.println("calling Fx interace method"+a);
		};
		
		show.display();
		
		Sayable sayable=(name)->{
			return "hello"+name;
		};
		
		String message= sayable.say("Nitika");
		System.out.println(message);
	}

}
