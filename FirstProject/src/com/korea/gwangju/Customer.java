package com.korea.gwangju;
//ĸ��ȭ encapsulation
public class Customer {
//field
	private int num;
	private String name;
	public int getNum() {
		if( ) //���� üũ ���� 
		return num;
	}
	public void setNum(int num) {
		if(num>0)
		this.num = num;
		else 
			System.out.println("��ȣ�� ���� ���� �Դϴ�.");
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
