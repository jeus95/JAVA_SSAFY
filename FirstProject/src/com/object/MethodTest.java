package com.object;

public class MethodTest {
	//int형 정수 2개를 입력받아 그 합을 출력하는 sum()
	static void sum(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	static int sum2(int a, int b) {
		int c = a + b;
		return a + b;
	}
	static boolean reverse(boolean input) {
		
		
		return !input;
		
		
	}
	static String result(boolean a ,boolean b) {
		return (a&&b) ? "ok" : "cancel";
		
		
//		if(a && b) {
//			return "OK";
//		}
//		else
//			return "cancel";
		
		
	}
	
	static void lootpString(int cnt , String msg){
		for(int i = 0 ; i< cnt; i++) {
			System.out.println(msg);
		}
		
	}
	static double getArea(int r) {
		return r*r*3.14;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(7,8);
		sum(3,6);
		
		System.out.println(sum2(1,6));
		
		
	}

}
