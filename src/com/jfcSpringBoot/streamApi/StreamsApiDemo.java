package com.jfcSpringBoot.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApiDemo {

//we have commented code , please execute the code by uncommenting one by one
	static List<String> namesList= Arrays.asList("Nitika","Priya","Anil","Mounika","sai","sita","teja","Priya","Nitika");
	static List<Integer> numsList= Arrays.asList(7,5,9,2,8,1);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//foreach
	    /**namesList.stream().forEach(System.out::println);*/
		//Selection Operations
	 //filter()
	 // display a list of names which is having more then length 4
	 /**namesList.stream().filter((String name)->name.length()>4).forEach(System.out::println);*/
		
	//distinct()
		 /**namesList.stream().distinct().forEach(System.out::println);*/
		
		//Limit()
		//selecting first 4 names 
		/**namesList.stream().limit(4).forEach(System.out::println);*/
		
		//Skip()
		//skiping first 4 names
		/**namesList.stream().skip(4).forEach(System.out::println);*/
		
		//map
		/**namesList.stream().map(String::length).forEach(System.out::println);*/
		
		//sort
		/**namesList.stream().sorted().forEach(System.out::println);*/
		
		
		//Reducing operators
		//reduce--->finding sum of list
		/**
		System.out.println(numsList.stream().reduce(0,(a,b)->a+b));
		System.out.println(numsList.stream().count());*/
		
		//collect
		/**
		Set<String> setNames=namesList.stream().limit(3).collect(Collectors.toSet());
		setNames.stream().forEach(System.out::println);*/
		
		if(namesList.stream().allMatch((String name)->name.length()>4))
		{
			System.out.println("all names are big");
		}
		else
		{
			System.out.println("all are not big");
		}
		
		Set<Integer> numsSet=numsList.stream().map(x->x*x).collect(Collectors.toSet());
		numsSet.stream().forEach(System.out::println);
		
		int even=numsSet.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
		System.out.println(even);
		
		
		
		
	 
	}

}
