package com.test;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열(참조형): 선언, 생성, 사용
		int score;// 선언
		score = 99;// 사용

		// int[] scores;//선언. 배열크기 주면 안됨
		// scores = new int[5];//new 키워드로 배열 생성. 배열 크기 지정
		int[] scores = new int[5];// 선언+생성
		scores[0] = 90;// 사용
		scores[1] = 70;
		scores[2] = 60;
		scores[3] = 80;
		scores[4] = 100;

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		int[] a = new int[100];//0
		double[] b= new double[200];//0.0
		boolean[] flag = new boolean[10];//false
		String[] msg = new String[10];//참조형은 기본 값이 .null
		// 선언, 생성, 초기화
		int[] scores2 = { 32, 58, 66, 79, 90 };

		// 향상된 for문
		for (int z : scores2) {
			System.out.println(z);
		}

		// 1.names: 배열안에 사람이름 5개 넣기
		// 2.배열안의 값 꺼내서 화면에 출력(향상된 for문 사용할 것)
		String[] names = { "이순신", "세종대왕", "이성계", "조현철", "철수" };

		for (String s : names) {
			System.out.println(s);
		}
		
		System.out.println(names.length);//배열의 크기

	}

}
