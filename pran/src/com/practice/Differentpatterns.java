package com.practice;
import java.util.Scanner;

public class Differentpatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows you want in pyramid");
		int noofRows=sc.nextInt();
		int rowCount=1;
		System.out.println("here is your pyramid");
		for(int i=noofRows;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=rowCount;j++)
			{
				//System.out.print("* ");
				System.out.print(rowCount+" ");
				//System.out.print(j+" ");
			}
			System.out.println();
			rowCount++;
		}
	}

}
