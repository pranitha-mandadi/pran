package com.practice;

import java.util.Scanner;

public class Aggregatemarks {
	public static void main(String[] args) {
		int s1,s2,s3,s4,s5;
		float agr,per;
		System.out.print("\nenter marks of student in s1");
		System.out.print("\nenter marks of student in s2");
		System.out.print("\nenter marks of student in s3");
		System.out.print("\nenter marks of student in s4");
		System.out.print("\nenter marks of student in s5");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
		agr=s1+s2+s3+s4+s5;
		per=agr/500*100;
		System.out.println("aggregate marks of student"+agr);
		System.out.println("percentage marks of student"+per);
		
		
	}

}
