package com.test;

public class LottoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int[] num = new int[6];
		
		for(int i=0; i<6;i++) {
			//1~45������ �������� num�� ����
			num[i]= (int)(Math.random()*45)+1;
			//�ߺ� ����
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

