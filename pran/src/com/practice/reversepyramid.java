package com.practice;
import java.util.Scanner;
public class reversepyramid {

	public static void main(String[] args) {
		// TODO Auto-generated met
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows you want in pyramid");
		int noofRows=sc.nextInt();
		int rowCount=noofRows;
		System.out.println("here is your pyramid");
		for(int i=0;i<noofRows;i++)
		{
		for(int j=1;j<=i*2;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=rowCount;j++)
		{
			System.out.print(j+" ");
		}
		for(int j=rowCount-1;j>=1;j--)
		{
			//System.out.print(rowCount+" ");
			System.out.print(j+" ");
		}
			System.out.println();
			rowCount--;
		}
	}

}
