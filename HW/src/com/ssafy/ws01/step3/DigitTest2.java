package com.ssafy.ws01.step3;

import java.util.Scanner;

public class DigitTest2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int sum = 0;
		int value;
		for(int j=0; j<3;j++) 
		{
			for(int k=0;k<10;k++) {
				value =sc.nextInt();
				if(value%2!=0) {
					sum+=value;
					
				}
			}
			System.out.println("#"+(j+1)+" "+sum );
			sum=0;
		}
		
	}
}
