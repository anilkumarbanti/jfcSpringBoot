package com.jfcSpringBoot.arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	//Non Generic
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList=new ArrayList(); //Non-generice
		//System.out.println(arrayList.size());
		
		arrayList.add("123");
		arrayList.add("192");
		arrayList.add("99.23");
		arrayList.add("23");
		arrayList.add("99.23");
		arrayList.add("123");
		
		
		
		//traverse through arrayList
		
		//Tradational for loop
		
		System.out.println("=== Tradational ===");
		for(int i=0;i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i)); //using default get() of arrayList
		}
		
		//Iterator
		
		/**System.out.println("=== Iterator ===");
		Iterator itr= arrayList.iterator();

		while(itr.hasNext())
		{
		System.out.println(itr.next());

		}*/
		
		//removing duplicate elements from arrayList
		HashSet hs=new HashSet<>(arrayList);
		System.out.println(arrayList);// output will be in array object formate
		System.out.println(hs);
		
		List al=new ArrayList<>(hs);
		System.out.println(al);
		
		//using stream
		arrayList.stream().distinct().forEach(System.out::println);
		

	}

}
