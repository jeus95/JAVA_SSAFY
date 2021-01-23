package com.test;

public class LoopTest {

	public static void main(String[] args) {
		String msg = "hello";
		
		//for(초기값:조건식:증감식){반복할 내용}
		for(int i = 0; i < 5;i++) {
			//System.out.println(i + "." + msg);
			
			//printf("출력할 값의 형식", 출력할 값)
			System.out.printf("%d,%s\n", i, msg);//printf(format)
		}
		
		//while
		int num = 100;//초기값
		
		while(num < 5) {//조건식
			System.out.println("gogogo~");//반복 내용
			num++;//증감식
		}
		
		
		//do~while
		int code = 100;//초기값
		do {
			System.out.println("welcome~");//반복 내용
			code++;//증감식
		}while(code < 5);//조건식
		
		
	}

}
