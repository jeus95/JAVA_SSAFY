package com.off.day1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HeightTest {

	public static void main(String[] args) {
		//1.Ű����κ��� �ο��� �Է¹ޱ� �迭 �����ϱ�
		//2. ������ ����� Ű���� �迭�� �����ϱ� (���� �߻� �̿�)
		//3.�迭�� ����� Ű�� �߿��� ���� ū �� �˾Ƴ� ���
		Random ran = new Random();
		System.out.print("�ο��� : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max=0;
		
		int[] pNum = new int[n];
		
		for(int i=0;i<pNum.length;i++) 
		{
			//pNum[i]=(int)(Math.random()*50)+150;
			pNum[i]=ran.nextInt(91)+100; //100~190���� ����

			if(pNum[i]>max) {
				max = pNum[i];
			}
		}
//		for(int j:pNum)
//		{
//			System.out.println( j );
//			
//		} ����ϴ� ��� 1
		System.out.println(Arrays.toString(pNum)); //��� �ϴ� ��� 2 
		System.out.println("Max = "+ max);
		
		
		
		
		

	}

}