package com.practice;

import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		int l,b;
	float area, per, radius,pie=3.14f,c;
   System.out.print("enter length 'l',breadth 'b'");
   System.out.print("enter radius 'r'");
   
  Scanner sc=new Scanner(System.in);
  l=sc.nextInt();
  b=sc.nextInt();
  radius=sc.nextFloat();
  area=pie*radius*radius;
  c=2*pie;
  
  area=2*(l+b);
  per=l*b;
  System.out.println("enter area and permiter of rectangle"+area+" "+per);
  System.out.println("enter area and cirumference of circle"+area+" "+c);
  
  
	
	}

}
