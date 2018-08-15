package com.practice;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		int a;
		System.out.print("enter values ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		//if(a%2==0)
		if ( (a/2)*2 == a )
			System.out.println(" even number");
			else
				System.out.println(" odd number");
		
		}
		
		
	}


