package com.basic;

public class StaticTest {
	//static field
	int count;
	static public int scount;//1.클래스 변수
	public static void go() {
		System.out.println("hello, static!!!");//2.static method
	}
	//3.static BLOCK{}
	static {
		System.out.println("static block-1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Math m = new math();
		System.out.println((Math.pow(2,3)));
		
		
		// 객체 생성할 필요 없이 클래스 이름으로 바로 사용 가능 ->class 정보가 등록 될때 다 생성됨
		System.out.println(StaticTest.scount);
	//	System.out.println(count);
//		StaticTest s1 = new StaticTest();
//		StaticTest s2 = new StaticTest();
//		StaticTest s3 = new StaticTest();
//
//		System.out.println(++s1.count + "--" + ++s2.count + "--" + ++s3.count);
//		System.out.println(++s1.scount + "--" + ++s2.scount + "--" + ++s3.scount);

	}
	static {
		System.out.println("static block-2");
	}

}
