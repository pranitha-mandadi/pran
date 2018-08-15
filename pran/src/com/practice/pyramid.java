package com.practice;

import java.util.Scanner;

public class pyramid {
	public static void main(String[] args) {
		int i,j,rows;
		System.out.print("enter the no of rows");
		Scanner sd=new Scanner(System.in);
		rows=sd.nextInt();
		for(i=1;i<=rows;++i)
		{
			for(j=1;j<=i;++j)
			{
				System.out.print("a  ");
			
			}
			System.out.println(" ");
			//System.out.println("result of the rows"+rows);
			
		}
		
		
	}

}
