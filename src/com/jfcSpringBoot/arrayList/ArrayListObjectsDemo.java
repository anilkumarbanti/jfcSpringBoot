package com.jfcSpringBoot.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student
{
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
public class ArrayListObjectsDemo {
	
	static ArrayList<Student> arrayList=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	static int size=sc.nextInt();
	
	public static void main(String[] args) {
		
		for(int i=0;i<size;i++)
		{
		arrayList.add(new Student(sc.nextInt(), sc.next()));
		}
		
		//Iterator
		
				System.out.println("=== Iterator ===");
				Iterator<Student> itr= arrayList.iterator();
//object
			/**	while(itr.hasNext())
				{
				System.out.println(itr.next());

				}  
				output:
		Student [id=12, name=anil]
		Student [id=15, name=priya]
		Student [id=17, name=teja] **/ 
				
				while(itr.hasNext())
				{
					Student st=(Student) itr.next();
					System.out.println(st.id+" "+st.name);
				}
				
				
	}

}
