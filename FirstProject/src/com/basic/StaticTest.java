package com.basic;

public class StaticTest {
	//static field
	int count;
	static public int scount;//1.Ŭ���� ����
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
		
		
		// ��ü ������ �ʿ� ���� Ŭ���� �̸����� �ٷ� ��� ���� ->class ������ ��� �ɶ� �� ������
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