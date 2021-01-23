package com.test;

public class MouseTest {

	public static void main(String[] args) {
		Hello h;//reference type
		
		//변수 선언하고 값을 준 후에 출력 해보기
		
		//제조사: 로지텍
		//가격: 55000
		//블루투스 지원여부 : 예
		//타입: x
		//무게: 80.5		
		String maker = "로지텍";
		int price = 55000;
		boolean bluetooth = true;
		char type = 'x';
		double weight = 80.5;
		
		System.out.printf("%s %d %b %s %s", maker, price, bluetooth, type, weight);
		
	}

}
