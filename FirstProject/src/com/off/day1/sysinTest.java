package com.off.day1;

import java.io.IOException;
import java.util.Random;

public class sysinTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int result = ran.nextInt(10); //0~9
		int result2 = 1+ran.nextInt(10); //1~10
		//System.out; //ǥ�� ���(console)
		//System.in; //ǥ�� �Է� 
		
//		int result = System.in.read();
		System.out.println(result);
//		System.out.println((char)result);
//		
		//Ű����� ���� �Է��ϸ� q�� �ٷ� �����°��� �ƴ϶� q�� ���� �ڵ尪(����)�� �Էµȴ�.
		//q�� Ÿ���� �ϸ� 113�� ���´�
		
//		Scanner sc =new Scanner(System.in);
//		System.out.println(sc.nextInt());; //������ �Է� �ްڴ�.
//		System.out.println(sc.next()); //���ڿ��� �Է� �ްڴ�.
		
		
	}

}