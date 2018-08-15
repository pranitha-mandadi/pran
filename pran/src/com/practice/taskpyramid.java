package com.practice;

import java.util.Scanner;

public class taskpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows you want in pyramid");
		int noofRows=sc.nextInt();
		int rowCount=1;
		System.out.println("here is your pyramid");
		//for(int i=noofRows;i>0;i--)
		for(int i = noofRows;i>=1;i--)
		{
			for(int j=1;j<=i*2;j++)
			{
				System.out.print(" ");
				}
		//for(int j=1;j<=rowCount;j++)
			for(int j=i;j<=noofRows;j++)
			{
				System.out.print(j+" ");
			}
		//for(int j=rowCount-1;j>=1;j--)
			for(int j=noofRows-1;j>=i;j--)
		{
			System.out.print(j+" ");
			
		}
		System.out.println();
		//rowCount++;
		rowCount--;
		}
		
	}

}
