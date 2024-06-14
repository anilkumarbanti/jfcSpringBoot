package com.jfcSpringBoot.jbasics;

import java.util.Scanner;

class Student
{
	String Sname;
	String Sbranch;
	double Sgpa;
	int Sid;
	static String Scollge;
	static String Suniversity;
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Student st=new Student();
		Student st2=new Student();
		
		Student.Scollge="bvrit";
		Student.Suniversity="JNTUH";
		
		st.Sname="anil";
		st.Sbranch="it";
		st.Sgpa=7.5;
		st.Sid=1277;
		
		
		
		st2.Sname="priya";
		st2.Sbranch="cse";
		st2.Sgpa=9.5;
		st2.Sid=1079;
		
		System.out.println(
				st.Sname + " " + st.Sbranch 
				+" "+st.Sgpa+" " + st.Sid
				+" "+ Student.Scollge +" "+
				Student.Suniversity
				           );
		
		System.out.println(
				st2.Sname + " " + st2.Sbranch 
				+" "+st2.Sgpa+" " + st2.Sid
				+" "+ Student.Scollge +" "+
				Student.Suniversity
				           );
		

	}

}
