package com.object;

import java.awt.Button;
import java.awt.Frame;

public class Car {
	//1. data : member, field , propert
	//전역 변수
	//클래스 안의 모든 메소드에서 사용 가능함
	int num;
	String model;
	String owner;
	boolean flag;
	double d;
	
	//객체를 생성할 떄 자동으로 호출되는 메소드
	//클래스의 이름과 동일한 메소드 이름, 리턴 타입은 적지 않음
//	Car(){} //생성자 맞음
//	Car1(){}
// void Car() {} //생성자는 아니지만 일반 메소드는 맞음
//	car() {} //생성자 x
	
	
	//this : new키워드로 heap에 생성된 객체 
	//this() 생성자 안에서 다른 생성자 호출
	public Car () {	//car(){}도 가능하지만 public Car() 가 있기때문에 사용 x
		//()가 비어있는 default 생성자
		//this.num =0;
		this(0);
	}
	public Car(int num) {//parameter가 있는 생성자
		this(num, " xyz");
		
	} 
	public Car(int num, String model) {//parameter가 있는 생성자
		
		//this.num = num;
		//this.model = model;
		this(num, model ,"anonymous");
	} 
	public Car(int num, String model , String Owner) {//parameter가 있는 생성자
		this.num = num;
		this.model = model;
		this.owner = Owner;
	} 
	//2.method : 어떤 일을 하는 작업 단위
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
	
	//3.main() 메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static method 안에서는 this, super 키워드 사용 불가
		System.out.println(this.num);
		//객체 생성
				Button b = new Button("ok");
				Frame f = new Frame("test");
				f.setSize(300,300);//창크기
				f.add(b);
				f.setVisible(true);
				Car c1 = new Car();
				Car c2 = new Car(7890);
				Car c3 = new Car(4567, "avante");
				Car c4 = new Car(5421, "k5","tommy");
				//생성한 객체 사용

				
				
				//System.out.println(c1.num + " , " + c1.model + "," + c1.Owner);
				c1.info();
				c2.info();
				c3.info();
				c4.info();
	}

}
