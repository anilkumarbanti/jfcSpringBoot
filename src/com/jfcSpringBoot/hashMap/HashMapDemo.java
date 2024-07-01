package com.jfcSpringBoot.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm =new HashMap<Integer,String>();
		
		hm.put(123, "mounika");
		hm.put(999, "teja");
		//String a = hm.get(999);
		System.out.println(hm);
		System.out.println(hm.get(999));
	
		Set<Integer> keySet=hm.keySet();
		System.out.println(keySet);
		
		Collection c=hm.values();
		System.out.println(c);
		
		//Set s1=hm.entrySet();
		//System.out.println(s1);
		
		Iterator itr=hm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry me= (Map.Entry)itr.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}

	}

}
