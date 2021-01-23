package com.singleton;
//클래스 설계 -> 디자인 패턴
//싱글톤 패턴 -> 객체를 생성을 한번만 수행하고 그 이후부터는 생성된 객체를 공유해서 사용하는 방식

//1) field : private static 수식이 붙어야 됨
//2) 생성자 : private
//3) 객체를 만들어서 리턴해주는 public static method가 존재해야함
public class SingletonObject {
	
	//field
	private static SingletonObject instance;
	
	//생성자
	private SingletonObject() {}
	
	//public method : 외부에서 사용 가능 한 메소드 
	public static SingletonObject getInstance() {
		if(instance == null)
			instance = new SingletonObject();
		
		return instance;
 	}
}
