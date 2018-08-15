package com.practice;

import java.util.Scanner;

public class Javafactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,fact=1;
		System.out.println("enter a value to calculate factorial");
		Scanner sc=new Scanner(System.in);
		 n =sc.nextInt();
		 if(n<0)
		 System.out.println("number non-negative");
		 else
		 {
			 for(i=1;i<=n;i++)
				 fact=fact*i;
			 System.out.println("factorial of "+n+" is:"+fact);
		 }
		
	}

}
