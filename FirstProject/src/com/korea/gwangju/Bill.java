package com.korea.gwangju;

import com.basic.StaticTest;
import com.korea.seoul.Tommy;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tommy t = new Tommy();
		t.go();
		
		System.out.println(t.age);
		System.out.println(StaticTest.scount);
		StaticTest.go();
	}	

}
