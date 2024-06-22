package com.jfcSpringBoot.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListDemoGeneric {
	//Generic
	static ArrayList<String> arrayList=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	static int size=sc.nextInt();
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//intializing the arraylist
		
		for(int i=0;i<size;i++)
		{
			//arrayList.add(new Scanner(System.in).next());
			arrayList.add(sc.next());
		}
		//Enhanced for loop-traversing
		System.out.println("=== Enhanced for loop-traversing ===");
		for(String x:arrayList)
		{
			System.out.println(x);
		}

	}

}
