package com.ssafy.ws01.step3;

public class DigitTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt = 1;
		
		for(int i = 0 ; i< 5; i++) {
			for(int k=5-i;k<5;k++) {
				System.out.printf("%3s", " ");
			}
			for(int j=5-i; j>0; j--) {
				System.out.printf("%3d",++cnt);
			}
		System.out.println();

	 }
	
	}
}
