package com.practice;

import java.util.Scanner;

public class Grossalary {
	public static void main(String[] args) {
		float bs,hra,da,gs;
		System.out.print("enter ramesh basicsalary");
		Scanner sc=new Scanner(System.in);
		bs=sc.nextFloat();
		da=40/100*bs;
		hra=20/100*bs;
		gs=bs-da-hra;
		System.out.println("gross salary of ramesh is"+gs);
		
	}

}
