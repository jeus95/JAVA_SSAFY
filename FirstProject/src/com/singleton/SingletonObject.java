package com.singleton;
//Ŭ���� ���� -> ������ ����
//�̱��� ���� -> ��ü�� ������ �ѹ��� �����ϰ� �� ���ĺ��ʹ� ������ ��ü�� �����ؼ� ����ϴ� ���

//1) field : private static ������ �پ�� ��
//2) ������ : private
//3) ��ü�� ���� �������ִ� public static method�� �����ؾ���
public class SingletonObject {
	
	//field
	private static SingletonObject instance;
	
	//������
	private SingletonObject() {}
	
	//public method : �ܺο��� ��� ���� �� �޼ҵ� 
	public static SingletonObject getInstance() {
		if(instance == null)
			instance = new SingletonObject();
		
		return instance;
 	}
}
