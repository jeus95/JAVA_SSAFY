package com.test;

public class DataTypeTest {
	//�ڵ��ϼ�: ctrl+space bar
	//�ڹ� ������ Ÿ��: �⺻��, ������
	public static void main(String[] args) {
		//������:boolean
		//flag: ����(� ���� �����ϴ� �����)
		boolean flag = true;//���ڴ� �ȵ�
		
		//byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		
		//������
		byte b = 127;//byte(-128 ~ 127). 1byte
		short s = 1000; //2byte
		int num = 100;//int: -21�� ~ 21�� . 4 byte
		long l = 9999999;//8 byte
		
		b=10;
		//b= b + 1; //���� ���ͷ��� ��� ���� �ҋ� 1��  vm�� 4byte�� �����ϰ� ����
		b= (byte)(b +1);
		
		//literal(��):�������ͷ�, �Ǽ����ͷ�...
		//�Ǽ���
		float f = 1.2f;//4 byte
		//f= 1.9; // �Ǽ� ���ͷ��� ��� �ʱ�ȭ �Ҷ����� vm�� 8byte�� �����ϰ� ����
		f = l;//ok
		l = (long)f;
		
		
		double point = 3.14;//8 byte
		f = (float)point;//(���ϴµ����� Ÿ��):type casting. ����ȯ -> ūŸ�Ե����͸� ���� Ÿ������ ��ȯ�� ���
		point = f;//ok
		
		//������: �� ���� ����
		char code = 'a';
		code = 'x';
		code = 97;//������ code ������ �ν�
		
		String name = "kim";//String(���ڿ�):������
		
		System.out.println(num);
		System.out.println(code);//b
		System.out.println(name);
		
		System.out.printf("%d\n%s\n%s\n", num, code, name);
		
		
	}

}