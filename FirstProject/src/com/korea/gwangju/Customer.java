package com.korea.gwangju;
//캡슐화 encapsulation
public class Customer {
//field
	private int num;
	private String name;
	public int getNum() {
		if( ) //권찬 체크 가능 
		return num;
	}
	public void setNum(int num) {
		if(num>0)
		this.num = num;
		else 
			System.out.println("번호는 양의 숫자 입니다.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String address;
}
