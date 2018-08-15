package com.practice;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Farenheittemp {
	public static void main(String[] args) {
		float celcius=0,farenheit=0;
		System.out.print("enter temperature in farenheit degree");
		Scanner sc=new Scanner(System.in);
		celcius=sc.nextFloat();
		celcius = (50/100*(farenheit-32))/90/100;
		System.out.println("calculate temperature in fareheit"+farenheit);
		}

}
