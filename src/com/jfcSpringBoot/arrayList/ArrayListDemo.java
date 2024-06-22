package com.jfcSpringBoot.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	//Non Generic
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList=new ArrayList(); //Non-generice
		//System.out.println(arrayList.size());
		
		arrayList.add("Sachin");
		arrayList.add("192");
		arrayList.add("99.23");
		
		System.out.println(arrayList);// output will be in array object formate
		
		//traverse through arrayList
		
		//Tradational for loop
		
		System.out.println("=== Tradational ===");
		for(int i=0;i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i)); //using default get() of arrayList
		}
		
		//Iterator
		
		System.out.println("=== Iterator ===");
		Iterator itr= arrayList.iterator();

		while(itr.hasNext())
		{
		System.out.println(itr.next());

		}
		
		

	}

}
