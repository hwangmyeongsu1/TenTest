package com.practice3.model.dto;

public class Dog extends Animal{
	
	private String PLACE = "애견카페";
	private int weigth;
	
	
	public Dog() {
	
	}


	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weigth = weight;
		// TODO Auto-generated constructor stub
	}


	public String getPLACE() {
		return PLACE;
	}


	public void setPLACE(String pLACE) {
		PLACE = pLACE;
	}


	public int getWeigth() {
		return weigth;
	}


	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}


	@Override
	public void speak() {
		System.out.println(super.toString() + "몸무게는" + weigth + "kg 입니다.");
	}
	
	
	
	
	
	
	
	
}
