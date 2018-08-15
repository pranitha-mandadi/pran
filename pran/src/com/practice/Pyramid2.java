package com.practice;

public class Pyramid2 {
public static void main(String[] args) {
	int a,x,n=71,o=70,y=1,c;
	for(x=1;x<=7;x++)
	{
		for(a=65;a<n;a++)
		{
			System.out.print(" A");
		}
		if(x==2)
			o=70;
		
		for(c=2;c<y;c++)
		{
			System.out.print(" ");
		}
		
		for(a=0;a>=65;a--)
		{
			System.out.print(" ");
	}
		
		System.out.print("\n");
		n--;
		o--;
		y=y+2;
		
	}
	
		
	}
}
