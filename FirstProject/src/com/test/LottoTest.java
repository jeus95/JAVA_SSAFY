package com.test;

public class LottoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int[] num = new int[6];
		
		for(int i=0; i<6;i++) {
			//1~45까지의 랜덤값을 num에 저장
			num[i]= (int)(Math.random()*45)+1;
			//중복 제거
			for(int k=0;k<i;k++) {
				if(num[k]==num[i]) {
					i--;
					break;
				}
			}
		}
		for(int j : num) {
			System.out.println(j);
			
		}
		
		
		
	}

}

