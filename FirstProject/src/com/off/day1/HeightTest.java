package com.off.day1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HeightTest {

	public static void main(String[] args) {
		//1.키보드로부터 인원수 입력받기 배열 생성하기
		//2. 각각의 사람들 키값을 배열에 저장하기 (난수 발생 이용)
		//3.배열에 저장된 키값 중에서 제일 큰 값 알아내 출력
		Random ran = new Random();
		System.out.print("인원수 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max=0;
		
		int[] pNum = new int[n];
		
		for(int i=0;i<pNum.length;i++) 
		{
			//pNum[i]=(int)(Math.random()*50)+150;
			pNum[i]=ran.nextInt(91)+100; //100~190까지 가능

			if(pNum[i]>max) {
				max = pNum[i];
			}
		}
//		for(int j:pNum)
//		{
//			System.out.println( j );
//			
//		} 출력하는 방법 1
		System.out.println(Arrays.toString(pNum)); //출력 하는 방법 2 
		System.out.println("Max = "+ max);
		
		
		
		
		

	}

}
