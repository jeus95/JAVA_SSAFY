package com.ssafy;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone phone = new Phone("S21");
		System.out.println(phone.getNameValue());
		phone.setNameValue("Galaxy Note");
		phone.setColor('A');
		phone.setPrice(10000);
		
		System.out.println(phone);
		
	}

}
