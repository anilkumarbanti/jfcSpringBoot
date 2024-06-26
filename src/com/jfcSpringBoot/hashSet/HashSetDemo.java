package com.jfcSpringBoot.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hashSet=new HashSet<>();
		hashSet.add("apple");
		hashSet.add("Bannana");
		hashSet.add("apple");
		System.out.println(hashSet);
		hashSet.remove("apple");
		System.out.println(hashSet);

	}

}

