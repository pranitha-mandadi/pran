package com.practice;

public class Main {
	public static void main(String[] args) {
		MyClass.instanceCount=0;
		MyClass firstInst = new MyClass();
		System.out.println(firstInst.instanceId);
		MyClass secondInst = new MyClass();
		MyClass thirdInst = new MyClass();
		firstInst.display();
		secondInst.display();
		thirdInst.display();
	}
}
