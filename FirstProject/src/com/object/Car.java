package com.object;

import java.awt.Button;
import java.awt.Frame;

public class Car {
	//1. data : member, field , propert
	//���� ����
	//Ŭ���� ���� ��� �޼ҵ忡�� ��� ������
	int num;
	String model;
	String owner;
	boolean flag;
	double d;
	
	//��ü�� ������ �� �ڵ����� ȣ��Ǵ� �޼ҵ�
	//Ŭ������ �̸��� ������ �޼ҵ� �̸�, ���� Ÿ���� ���� ����
//	Car(){} //������ ����
//	Car1(){}
// void Car() {} //�����ڴ� �ƴ����� �Ϲ� �޼ҵ�� ����
//	car() {} //������ x
	
	
	//this : newŰ����� heap�� ������ ��ü 
	//this() ������ �ȿ��� �ٸ� ������ ȣ��
	public Car () {	//car(){}�� ���������� public Car() �� �ֱ⶧���� ��� x
		//()�� ����ִ� default ������
		//this.num =0;
		this(0);
	}
	public Car(int num) {//parameter�� �ִ� ������
		this(num, " xyz");
		
	} 
	public Car(int num, String model) {//parameter�� �ִ� ������
		
		//this.num = num;
		//this.model = model;
		this(num, model ,"anonymous");
	} 
	public Car(int num, String model , String Owner) {//parameter�� �ִ� ������
		this.num = num;
		this.model = model;
		this.owner = Owner;
	} 
	//2.method : � ���� �ϴ� �۾� ����
	void go() {
		System.out.println("go");
	}
	void stop() {
		System.out.println("stop!!!");
	}
	void info() {
		System.out.println("num : "+ num);
		System.out.println("model : "+ model);
		System.out.println("owner : "+ owner);
		System.out.println("------------------------");
	}
	
	//3.main() �޼ҵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static method �ȿ����� this, super Ű���� ��� �Ұ�
		System.out.println(this.num);
		//��ü ����
				Button b = new Button("ok");
				Frame f = new Frame("test");
				f.setSize(300,300);//âũ��
				f.add(b);
				f.setVisible(true);
				Car c1 = new Car();
				Car c2 = new Car(7890);
				Car c3 = new Car(4567, "avante");
				Car c4 = new Car(5421, "k5","tommy");
				//������ ��ü ���

				
				
				//System.out.println(c1.num + " , " + c1.model + "," + c1.Owner);
				c1.info();
				c2.info();
				c3.info();
				c4.info();
	}

}
