package com.practice3.controller;

import com.practice3.model.dto.Animal;
import com.practice3.model.dto.Cat;
import com.practice3.model.dto.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		Animal []ani = new Cat[5];
		Animal [] ani2 = new Dog[5];
		
		ani[0] = new Cat("메로","포메","한국","빨강");
		ani[1] = new Cat("바보","진돗개","미국","주황");
		ani[2] = new Cat("멍청이","시바견","영국","노랑");
		ani[3] = new Cat("똥개","리트리버","러시아","초록");
		ani[4] = new Cat("노답","삽살개","중국","파랑");
		
		System.out.println("============고양이===========");
		for (int i =0; i < ani.length; i++) {
			((Cat) ani[i]).speak();
		}
		
		
		System.out.println("============강아지===========");
		
		ani2[0] = new Dog("바보","시바",20);
		ani2[1] = new Dog("멍청이","포메",30);
		ani2[2] = new Dog("메로","삽",40);
		ani2[3] = new Dog("므러","살",20);
		ani2[4] = new Dog("웨어","개",10);
		
		for (int i =0; i < ani.length; i++) {
			((Dog) ani2[i]).speak();
		}
		

		
		
	
		
	
		
		
		
		
		
		
	}

}
