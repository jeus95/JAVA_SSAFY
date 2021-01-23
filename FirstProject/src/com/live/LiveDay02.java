package com.live;

import java.util.Arrays;

public class LiveDay02 {

	public static void main(String[] args) {

		int[] intArray = { 
			1, 3, 4, 7, 8, 10, 12, 15, 16, 17, 18 
		};
		
		int[] used = new int[21];	// 0 : dummy

		for (int i = 0; i < intArray.length; i++) {
			used[intArray[i]]++;
		}
		
		for (int i = 1; i < used.length; i++) { //위에서 0을 더미로 이용했으므로 1부터 사용
			if( used[i] == 0 ) {
				System.out.print(i + " ");
			}
		}			
	}
}
