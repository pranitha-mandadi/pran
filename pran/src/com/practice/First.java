package com.practice;

import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		int a,b,sum,per;
		System.out.println("enter a,b");
		Scanner sc=new Scanner(System.in);
		a = sc.nextInt();
		b =sc.nextInt();
		sum=a+b;
		per=a+b/2;
		
		System.out.println("A"+a+"B"+b);
		System.out.println("sum of a+b="+sum);
		System.out.println("percentage of a,b="+per);
	}

}
