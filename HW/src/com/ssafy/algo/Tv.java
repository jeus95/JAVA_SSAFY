package com.ssafy.algo;

public class Tv {
	
	private int num;
	private String name;
	private int price;
	private int amount;
	private	int inch;
	private String disType;

	//Encapsulation 
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public String getDisType() {
		return disType;
	}
	public void setDisType(String disType) {
		this.disType = disType;
	}
	
	//Constructor 
	
	public Tv(){
	}
	
	public String toString() {
		return "Num : "+this.num +" , "+"Name : "+this.name +" , "+"Price : "+ this.price +" , "+"Amount : "+ this.amount +" , "+"inch : "+this.inch +" , "+"disType : "+this.disType;
		
	}
}
