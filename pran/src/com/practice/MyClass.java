package com.practice;

public class MyClass {
	private static int version;

	public static int instanceCount;
	public int instanceId;
	
	public MyClass() {
		MyClass.instanceCount++;
		this.instanceId = instanceCount;
	}
	
	public void display(){
		System.out.println("My Class Version:"+version+" .My Instance Id:"+instanceId+" Instance Count:"+instanceCount);
	}
}
