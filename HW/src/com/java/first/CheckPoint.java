package com.java.first;

import java.util.Scanner;
public class CheckPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a , b,degree;
		a = sc.nextInt();
		b = sc.nextInt();
		degree = (b+100-a);
		if(degree>0)
		System.out.println("비만수치는 " + degree +"입니다.");
		System.out.println("당신은 비만입니다.");
	}

}
