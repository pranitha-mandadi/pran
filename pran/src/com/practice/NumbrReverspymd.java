package com.practice;

import java.util.Scanner;

public class NumbrReverspymd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many rows you want in pyramid");
		int noofRows = sc.nextInt();
		int RowCount = noofRows;
		System.out.print("here is your pyramid ");
		for(int i=0;i<noofRows-1;i++)
		{
			for(int j=1;j<=2*i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=RowCount;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=RowCount-1;j>=1;j--)
			{
				System.out.print(j+" ");
			
			}
			System.out.println();
		
		RowCount--;
		
			
		}
	}

}
