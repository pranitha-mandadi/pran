package com.practice;

import java.util.Scanner;

public class Evenorodd {
	public static void main(String[] args) {
		int n;
		System.out.print("enter any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("enter number is even"+n);
		}
			else
			{
				System.out.println("enter number is odd"+n);
		}
		
		
	}
}
