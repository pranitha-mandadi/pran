package com.practice;

import java.util.Scanner;

public class Interchange {
	public static void main(String[] args) {
		int c,d,temp;
	 System.out.print("enter numbers to store in location c,d");
	 Scanner sc=new Scanner(System.in);
	 c=sc.nextInt();
	 d=sc.nextInt();
	 temp=c;
	 c=d;
	 d=temp;
	 System.out.println("after interchange\n");
	 System.out.println("number stored in location c"+c);
	 System.out.println("number stored in location d"+d);
			
		}
	}


