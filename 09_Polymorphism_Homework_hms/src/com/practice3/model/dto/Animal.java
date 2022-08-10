package com.practice3.model.dto;

public abstract class Animal {
	
	public String name;
	public  String kinds;
	
	public Animal() {
	
	}

	public Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}

	void speak() {
		
	}
	@Override
	public String toString() {
		
		return "저의 이름은"+name + "이고, 종류는" + kinds + "입니다";
	}
	
	
	
	
}
