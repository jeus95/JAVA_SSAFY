package com.ssafy;

public class Phone {
	public String name = "galaxy note";
	private int price;
	private char color;
	
	public String getNameValue() {
		return name;
	}
	public void setNameValue(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	public int getRealDebt() {
		return price + 10000;
	}
	public Phone(String name) {
		this.name = name;
		System.out.println("A");
		System.out.println(this.name);
	}
	public Phone() { //기본 생성자
		System.out.println("B");
		System.out.println(this.name);
	}
	
	public int getSalePrice() {
	if(this.color == 'A') {
		return this.price;
	}
	else
		return this.price + 1000;
	}
	
	public String toString() {
		return this.name + ","+this.price;
		
	}
}
