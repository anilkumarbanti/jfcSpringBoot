package com.jfcSpringBoot.jarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt(); //4
		int[] arrayNum=new int[size];
		
		
		
		//array intialization
		
		for(int i=0;i<size;i++)
		{
			arrayNum[i]=sc.nextInt(); // 10 20 15 25
		}
		
		//traversing through array
		
		for(int i=0;i<size;i++)
		{
			System.out.println(arrayNum[i]+" ");
		}
		System.out.println(Arrays.binarySearch(arrayNum,15));
		Arrays.sort(arrayNum);
		for(int i=0;i<size;i++)
		{
			System.out.println(arrayNum[i]+" ");
		}
		
		//equals, fill,copyOf, parallelSort

	}

}
