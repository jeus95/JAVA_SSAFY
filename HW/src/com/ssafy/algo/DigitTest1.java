package com.ssafy.algo;

import java.util.Scanner;

public class DigitTest1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); 
		int[] array = new int[10];
		
		while(a!=0) {
			array[a/10]++;
			a = sc.nextInt(); 
		}
		
		for(int i=0; i<10; i++)
			
		if(array[i]>0) {
			System.out.println(i+" : " + array[i] +"��");
		}
		
	}
	
}
