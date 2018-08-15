package com.practice;

import java.util.Scanner;

public class LeftPyramid {
	public static void main(String[] args) {
		int i,j,rows,c;
		System.out.print("enter no of rows");
		Scanner sc=new Scanner(System.in);
		rows=sc.nextInt();
		for(i=1;rows>=1;i++)
		{
			for(j=rows-i;j<=i;j++)
			{
				for(c=1;c<=i;c++)
				{
				System.out.println(" ");
				}
				
			}
			System.out.println("*");
			
		}
	}

}
