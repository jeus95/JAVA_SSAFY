package com.test;

public class LoopTest {

	public static void main(String[] args) {
		String msg = "hello";
		
		//for(�ʱⰪ:���ǽ�:������){�ݺ��� ����}
		for(int i = 0; i < 5;i++) {
			//System.out.println(i + "." + msg);
			
			//printf("����� ���� ����", ����� ��)
			System.out.printf("%d,%s\n", i, msg);//printf(format)
		}
		
		//while
		int num = 100;//�ʱⰪ
		
		while(num < 5) {//���ǽ�
			System.out.println("gogogo~");//�ݺ� ����
			num++;//������
		}
		
		
		//do~while
		int code = 100;//�ʱⰪ
		do {
			System.out.println("welcome~");//�ݺ� ����
			code++;//������
		}while(code < 5);//���ǽ�
		
		
	}

}
