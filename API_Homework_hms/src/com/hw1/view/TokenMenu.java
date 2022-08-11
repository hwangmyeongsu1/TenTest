package com.hw1.view;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

import com.hw1.controller.TokenController;

public class TokenMenu {
	
	Scanner sc = new Scanner(System.in);
	
	TokenController tc = new TokenController();
	
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			
			
			switch(num) {
			case 1 : 
				this.tokenMenu();
				break;
			case 2 :
				this.inputMenu();
				break;
			case 9 :
				System.out.println("프로그램 종료합니다.");
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
				
			}
			
			if(num == 9) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
		}
		
		
		
		
	}
	public void tokenMenu() {
		String str2 = "";
		String str = " J a v a P r o g r a m";
		System.out.println("토큰 처리 전 글자: " + str);
		System.out.println("토큰 처리 전 글자 개수 : " + str.length());
		str2 = tc.afterToken(str);	
		System.out.println("토큰 처리 후 글자 : " + str2);
		System.out.println("토큰 처리 후 글자 개수 : " + str2.length());
		System.out.println("대문자로 변환 : " + str2.toUpperCase() );
		
		
	}
	public void inputMenu() {
		String a = "";
		System.out.println("문자열을 입력하세요 : ");
		
		String input = sc.nextLine();
		
		
		sc.nextLine();
		System.out.println("찾을 문자를 하나 입력하세요");
		char b = sc.nextLine().charAt(0);
		tc.findChar(input, b);
		
		
		
	}
	
	
	
}
