package com.object;

public class CarUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü ����
		Car c1 = new Car();
		Car c2 = new Car();
		//������ ��ü ���
		c1.num = 1234;
		c1.model = "avante";
		c1.owner = "tommy";
		
		
		//System.out.println(c1.num + " , " + c1.model + "," + c1.Owner);
		c1.info();
		c2.info();
	}

}