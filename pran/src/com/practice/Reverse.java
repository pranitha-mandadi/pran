package com.practice;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		int rev=0 ,n,res;
		System.out.print("enter rev of a num");
		Scanner sc=new Scanner(System.in);
		n = sc.nextInt();
		while(n!=0)
		{
		res=n%10;
		rev=rev*10+res;
		n=n/10;
		}
		System.out.println("enter reverse of a number="+rev);
		
	}
}
