package com.object;
//field radious (int)


public class Circle {
	int radious;
	int num; //전역 변수
	 double getArea() {
		return 3.14*radious*radious;
	}
	 double getCircum() {
		return 2*3.14*radious;
	}
	Circle(int radious){
		this.radious = radious;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 99; //지역변수(local variable)
		
		Circle cir = new Circle(3);
		cir.radious = 3;
		System.out.println(cir.getArea());
		System.out.println(cir.getCircum());
	}

}
