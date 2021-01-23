package com.test;

public class OperateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true, b = true, c =false;
	
		if(a&&b)
			System.out.println("level-1");
		if (a||c) 
			System.out.println("level-2");
		int x= 90, y=91;
		int max = (x>y)? x:y;
		System.out.println(max);
	}
	
}	
